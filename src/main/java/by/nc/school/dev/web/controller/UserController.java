package by.nc.school.dev.web.controller;

import by.nc.school.dev.beans.User;
import by.nc.school.dev.beans.enums.Role;
import by.nc.school.dev.service.DataValidator;
import by.nc.school.dev.service.interfaces.UserService;
import by.nc.school.dev.web.util.Pages;
import by.nc.school.dev.web.util.SessionAttributes;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import java.util.List;

@Controller
@RequestMapping(Pages.USER.PATH_ABSOLUTE)
public class UserController {
    protected UserService userService;

    @Required
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.POST, value = Pages.USER.LOGIN.PATH)
    public String login(HttpSession session,
                        @RequestParam(SessionAttributes.USER_LOGIN) String userName,
                        @RequestParam(SessionAttributes.USER_PASSWORD) String password) {
        String page;
        boolean isLoggedIn = false;
        User user = userService.findUserByUsername(userName);
        if (user == null) {
            page = Pages.VIEWS.LOGIN.PATH_ABSOLUTE;
        } else if (DataValidator.checkPass(password, user.getPassword())) {
            isLoggedIn = true;
            if (user.getRole().equals(Role.PROFESSOR)) {
                page = Pages.VIEWS.PROFESSOR.PATH_ABSOLUTE;
            } else {
                page = Pages.VIEWS.STUDENT.PATH_ABSOLUTE;
            }
        } else {
            page = Pages.VIEWS.LOGIN.PATH_ABSOLUTE;
        }
        session.setAttribute(SessionAttributes.IS_LOGGED_IN, isLoggedIn);
        return "redirect:" + page;
    }

    @RequestMapping(method = RequestMethod.GET, value = Pages.USER.LOGOUT.PATH)
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:" + Pages.VIEWS.LOGIN.PATH_ABSOLUTE;
    }

    @Transactional
    @RequestMapping(method = RequestMethod.POST, value = Pages.USER.REGISTER.PATH)
    public String register(HttpSession session,
                           @RequestParam(SessionAttributes.USER_LOGIN) String login,
                           @RequestParam(SessionAttributes.USER_PASSWORD) String password,
                           @RequestParam(SessionAttributes.USER_PASSWORD_REPEAT) String passwordRepeat,
                           @RequestParam(SessionAttributes.USER_ROLE) String roleName,
                           @RequestParam(SessionAttributes.USER_SURNAME) String surname,
                           @RequestParam(SessionAttributes.USER_NAME) String name,
                           @RequestParam(SessionAttributes.USER_EMAIL) String email,
                           @RequestParam(SessionAttributes.USER_TELEPHONE_NUMBER) String telephoneNumber,
                           Model model) {
        String page;

        Role role = Role.getRoleByName(roleName);
        if (role.name().equals("STUDENT")) {
            page = Pages.VIEWS.STUDENT.PATH_ABSOLUTE;
        } else {
            page = Pages.VIEWS.PROFESSOR.PATH_ABSOLUTE;
        }

        if (login == null || name == null || surname == null || email == null || telephoneNumber == null) {
            model.addAttribute(SessionAttributes.EMPTY_FIELDS, true);
            //return "redirect:" + page;
        } else if (password == null || !password.equals(passwordRepeat)) {
            model.addAttribute(SessionAttributes.PASSWORD_ERROR, true);
            //return page;
        } else if (!DataValidator.validateRegisterData(login, password)) {
            model.addAttribute(SessionAttributes.REGEX_ERROR, true);
            //return page;
        } else if (userService.checkLoginExist(login)) {
            model.addAttribute(SessionAttributes.LOGIN_EXISTS, true);
            //return page;
        } else {
            User user = new User(login, password, role, surname, name, email, telephoneNumber);
            session.setAttribute(SessionAttributes.SUCCESS_ADD_USER, userService.addUser(user));
        }
        return "redirect:" + page;
    }

    @RequestMapping(method = RequestMethod.GET, value = Pages.USER.ALL_USERS.PATH)
    public String getAllUsers(HttpSession session) {
        List<User> users = userService.getListUsers();
        session.setAttribute(SessionAttributes.ALL_USERS, users);
        return "redirect:" + Pages.USER.ALL_USERS.PATH_ABSOLUTE;
    }

    @RequestMapping(method = RequestMethod.GET, value = Pages.USER.ADD_USER.PATH)
    public String addUser(HttpSession session,
                          @RequestParam(SessionAttributes.USER_LOGIN) String login,
                          @RequestParam(SessionAttributes.USER_PASSWORD) String password,
                          @RequestParam(SessionAttributes.USER_ROLE) String roleName,
                          @RequestParam(SessionAttributes.USER_SURNAME) String surname,
                          @RequestParam(SessionAttributes.USER_NAME) String name,
                          @RequestParam(SessionAttributes.USER_EMAIL) String email,
                          @RequestParam(SessionAttributes.USER_TELEPHONE_NUMBER) String telephoneNumber) {
        Role role = Role.getRoleByName(roleName);
        User user = new User(login, password, role, surname, name, email, telephoneNumber);
        session.setAttribute(SessionAttributes.SUCCESS_ADD_USER, userService.addUser(user));
        return "redirect" + Pages.USER.ADD_USER.PATH_ABSOLUTE;
    }

    @RequestMapping(method = RequestMethod.GET, value = Pages.USER.EDIT_USER.PATH)
    public String editUser(HttpSession session,
                           @RequestParam(SessionAttributes.USER_ID) Long id,
                           @RequestParam(SessionAttributes.USER_LOGIN) String login,
                           @RequestParam(SessionAttributes.USER_PASSWORD) String password,
                           @RequestParam(SessionAttributes.USER_ROLE) String roleName,
                           @RequestParam(SessionAttributes.USER_SURNAME) String surname,
                           @RequestParam(SessionAttributes.USER_NAME) String name,
                           @RequestParam(SessionAttributes.USER_EMAIL) String email,
                           @RequestParam(SessionAttributes.USER_TELEPHONE_NUMBER) String telephoneNumber,
                           Model model) {
        Role role = Role.getRoleByName(roleName);
        User user = new User(id, login, password, role, surname, name, email, telephoneNumber);
        model.addAttribute(SessionAttributes.SUCCESS_UPDATE, userService.editUser(user) != null);
        session.setAttribute(SessionAttributes.USER, user);
        return "redirect:" + Pages.USER.EDIT_USER.PATH_ABSOLUTE;
    }
}