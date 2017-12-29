package by.nc.school.dev.web.controller;

import by.nc.school.dev.beans.Professor;
import by.nc.school.dev.beans.Student;
import by.nc.school.dev.service.interfaces.ProfessorService;
import by.nc.school.dev.web.util.Pages;
import by.nc.school.dev.web.util.SessionAttributes;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(Pages.PROFESSOR.PATH_ABSOLUTE)
public class ProfessorController {
    protected ProfessorService professorService;

    @Required
    public void setProfessorService(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @RequestMapping(method = RequestMethod.GET, value = Pages.PROFESSOR.ALL_PROFESSORS.PATH)
    public String getAllProfessors(HttpSession session) {
        List<Professor> professors = professorService.getListProfessors();
        session.setAttribute(SessionAttributes.ALL_PROFESSORS, professors);
        return "redirect:" + Pages.PROFESSOR.ALL_PROFESSORS.PATH_ABSOLUTE;
    }

    @RequestMapping(method = RequestMethod.GET, value = Pages.PROFESSOR.ADD_PROFESSOR.PATH)
    public String addProfessor(HttpSession session,
                             @RequestParam(SessionAttributes.USER_SURNAME) String surname,
                             @RequestParam(SessionAttributes.USER_NAME) String name,
                             @RequestParam(SessionAttributes.USER_EMAIL) String email,
                             @RequestParam(SessionAttributes.USER_TELEPHONE_NUMBER) String telephoneNumber,
                             @RequestParam(SessionAttributes.PROFESSOR_SCIENCE_DEGREE) String scienceDegree,
                             @RequestParam(SessionAttributes.PROFESSOR_LIST_SUBJECTS_TEACH) String listProfessorSubjectsTeach
    ) {
        Professor professor = new Professor(surname, name, email, telephoneNumber, scienceDegree);

        session.setAttribute(SessionAttributes.SUCCESS_ADD_PROFESSOR, professorService.addProfessor(professor) != null);
        return "redirect:" + Pages.PROFESSOR.ADD_PROFESSOR.PATH_ABSOLUTE;
    }

    @RequestMapping(method = RequestMethod.GET, value = Pages.PROFESSOR.EDIT_PROFESSOR.PATH)
    public String editProfessor(HttpSession session,
                              @RequestParam(SessionAttributes.USER_SURNAME) String surname,
                              @RequestParam(SessionAttributes.USER_NAME) String name,
                              @RequestParam(SessionAttributes.USER_EMAIL) String email,
                              @RequestParam(SessionAttributes.USER_TELEPHONE_NUMBER) String telephoneNumber,
                              @RequestParam(SessionAttributes.PROFESSOR_SCIENCE_DEGREE) String scienceDegree,
                              @RequestParam(SessionAttributes.PROFESSOR_LIST_SUBJECTS_TEACH) String listProfessorSubjectsTeach,
                              Model model) {
        Professor professor = new Professor(surname, name, email, telephoneNumber, scienceDegree);
        model.addAttribute(SessionAttributes.SUCCESS_UPDATE, professorService.editProfessor(professor) != null);
        session.setAttribute(SessionAttributes.PROFESSOR, professor);
        return "redirect:" + Pages.PROFESSOR.EDIT_PROFESSOR.PATH_ABSOLUTE;
    }


}
