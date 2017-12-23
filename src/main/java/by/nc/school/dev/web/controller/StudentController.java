package by.nc.school.dev.web.controller;

import by.nc.school.dev.dao.DAOInterfacesEntities.StudentDAO;
import by.nc.school.dev.service.interfaces.StudentService;
import by.nc.school.dev.web.util.Pages;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(Pages.STUDENT.PATH_ABSOLUTE)
public class StudentController {
    protected StudentService studentService;
    protected StudentDAO studentDAO;

    @Required
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @Required
    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }


}
