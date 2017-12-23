package by.nc.school.dev.dao.DAOInterfacesEntities;

import by.nc.school.dev.beans.Student;
import by.nc.school.dev.beans.Subject;
import by.nc.school.dev.exceptions.UserException;

import java.util.List;

public interface StudentDAO {
    public int addStudent();
    //public boolean deleteStudent();
    public Student getStudentById(int id) throws UserException;
    //public Student findStudentBySurname(String surname) throws UserException;
    public boolean editStudent();
    public boolean showStudentProfile();
    public double getCoefficientScholarship();
    public List<Subject> getListLearningSubjects();
}
