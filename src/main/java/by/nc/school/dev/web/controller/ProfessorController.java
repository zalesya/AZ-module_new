package by.nc.school.dev.web.controller;

import by.nc.school.dev.service.interfaces.ProfessorService;
import by.nc.school.dev.web.util.Pages;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(Pages.PROFESSOR.PATH_ABSOLUTE)
public class ProfessorController {
    protected ProfessorService professorService;

    @Required
    public void setProfessorService(ProfessorService professorService) {
        this.professorService = professorService;
    }


}
