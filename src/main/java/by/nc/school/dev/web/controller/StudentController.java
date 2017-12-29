package by.nc.school.dev.web.controller;

import by.nc.school.dev.beans.Student;
import by.nc.school.dev.beans.User;
import by.nc.school.dev.beans.enums.Role;
import by.nc.school.dev.service.interfaces.StudentService;
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
@RequestMapping(Pages.STUDENT.PATH_ABSOLUTE)
public class StudentController {
    protected StudentService studentService;

    @Required
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(method = RequestMethod.GET, value = Pages.STUDENT.ALL_STUDENTS.PATH)
    public String getAllStudents(HttpSession session) {
        List<Student> students = studentService.getListStudents();
        session.setAttribute(SessionAttributes.ALL_STUDENTS, students);
        return "redirect:" + Pages.STUDENT.ALL_STUDENTS.PATH_ABSOLUTE;
    }

    @RequestMapping(method = RequestMethod.GET, value = Pages.STUDENT.ADD_STUDENT.PATH)
    public String addStudent(HttpSession session,
                          @RequestParam(SessionAttributes.USER_SURNAME) String surname,
                          @RequestParam(SessionAttributes.USER_NAME) String name,
                          @RequestParam(SessionAttributes.USER_EMAIL) String email,
                          @RequestParam(SessionAttributes.USER_TELEPHONE_NUMBER) String telephoneNumber,
                          @RequestParam(SessionAttributes.STUDENT_COURSE_NUMBER) String courseNumber,
                          @RequestParam(SessionAttributes.STUDENT_AVERAGE_SCORE) String averageScore,
                          @RequestParam(SessionAttributes.STUDENT_NUMBER_RECORD_BOOK) String numberRecordBook,
                          @RequestParam(SessionAttributes.STUDENT_LIST_SUBJECTS_STUDY) String listStudentSubjectsStudy
                          ) {
        Student student = new Student(surname, name, email, telephoneNumber, Integer.parseInt(courseNumber),
                Double.parseDouble(averageScore), Long.parseLong(numberRecordBook));

        session.setAttribute(SessionAttributes.SUCCESS_ADD_STUDENT, studentService.addStudent(student));
        return "redirect:" + Pages.STUDENT.ADD_STUDENT.PATH_ABSOLUTE;
    }

    @RequestMapping(method = RequestMethod.GET, value = Pages.STUDENT.EDIT_STUDENT.PATH)
    public String editStudent(HttpSession session,
                          @RequestParam(SessionAttributes.USER_SURNAME) String surname,
                          @RequestParam(SessionAttributes.USER_NAME) String name,
                          @RequestParam(SessionAttributes.USER_EMAIL) String email,
                          @RequestParam(SessionAttributes.USER_TELEPHONE_NUMBER) String telephoneNumber,
                          @RequestParam(SessionAttributes.STUDENT_COURSE_NUMBER) String courseNumber,
                          @RequestParam(SessionAttributes.STUDENT_AVERAGE_SCORE) String averageScore,
                          @RequestParam(SessionAttributes.STUDENT_NUMBER_RECORD_BOOK) String numberRecordBook,
                          @RequestParam(SessionAttributes.STUDENT_LIST_SUBJECTS_STUDY) String listStudentSubjectsStudy,
                          Model model) {
        Student student = new Student(surname, name, email, telephoneNumber, Integer.parseInt(courseNumber),
                Double.parseDouble(averageScore), Long.parseLong(numberRecordBook));
        model.addAttribute(SessionAttributes.SUCCESS_UPDATE, studentService.editStudent(student) != null);
        session.setAttribute(SessionAttributes.STUDENT, student);
        return "redirect:" + Pages.STUDENT.EDIT_STUDENT.PATH_ABSOLUTE;
    }
}
