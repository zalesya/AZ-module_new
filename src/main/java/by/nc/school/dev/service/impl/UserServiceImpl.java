package by.nc.school.dev.service.impl;

import by.nc.school.dev.beans.User;
import by.nc.school.dev.repository.UserRepository;
import by.nc.school.dev.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class UserServiceImpl implements UserService {
    protected UserRepository userRepository;

    public boolean doLogin(User user) {
        User userTemp = userRepository.findUserByUsername(user.getUsername());
        return checkAuthorization(userTemp, user);
    }

    private boolean checkAuthorization(User userTemp, User user) {
        boolean result = false;
        if (userTemp != null) {
            if (userTemp.getPassword().equals(user.getPassword())) {
                result = true;
            }
        }
        return result;
    }

    public boolean checkLoginExist(String login) {
        User user = userRepository.findUserByUsername(login);
        return user != null;
    }

    public User addUser(User user) {
        User savedUser = userRepository.saveAndFlush(user);
        return savedUser;
    }

    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }

    public List<User> getListUsers() {
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.findUserById(id);
    }

    public User findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    public User editUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Required
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
