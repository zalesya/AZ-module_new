package by.nc.school.dev.service.interfaces;

import by.nc.school.dev.beans.Student;
import by.nc.school.dev.beans.Subject;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);
    void deleteStudent(Long id);
    List<Student> getListStudents();
    Student getStudentById(int id);
    Student findStudentByNumberRecordBook(long numberRecordBook);
    Student editStudent(Student student);
    boolean showStudentProfile();
    double getCoefficientScholarship();
    List<Subject> getListLearningSubjects();
}
