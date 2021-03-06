package by.nc.school.dev.web.provider;

import by.nc.school.dev.repository.StudentRepository;
import by.nc.school.dev.repository.UserRepository;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.ui.Model;

public class HomeModelProvider implements ModelProvider {

    protected UserRepository userRepository;
    protected StudentRepository studentRepository;

    private HomeModelProvider() {}

    @Override
    public void fillModel(Model model) {
        model.addAttribute("users", userRepository.findAll());
        model.addAttribute("students", studentRepository.findAll());
    }

    @Required
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Required
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
