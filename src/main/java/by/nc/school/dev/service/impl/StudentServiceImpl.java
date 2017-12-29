package by.nc.school.dev.service.impl;

import by.nc.school.dev.beans.Student;
import by.nc.school.dev.beans.Subject;
import by.nc.school.dev.repository.StudentRepository;
import by.nc.school.dev.service.interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public Student addStudent(Student student) {
        Student savedStudent = studentRepository.saveAndFlush(student);
        return savedStudent;
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public List<Student> getListStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id);
    }

    public Student findStudentByNumberRecordBook(long numberRecordBook) {
        return studentRepository.findByNumberRecordBook(numberRecordBook);
    }

    public Student editStudent(Student student) {
        return studentRepository.saveAndFlush(student);
    }

    public boolean showStudentProfile() {
        return false;
    }

    public double getCoefficientScholarship() {
        return 0;
    }

    public List<Subject> getListLearningSubjects() {
        return null;
    }

    @Required
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
