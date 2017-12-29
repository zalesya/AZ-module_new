package by.nc.school.dev.service.interfaces;

import by.nc.school.dev.beans.Professor;
import by.nc.school.dev.beans.Subject;

import java.util.List;

public interface ProfessorService {
    Professor addProfessor(Professor professor);
    void deleteProfessor(Long id);
    List<Professor> getListProfessors();
    Professor getProfessorById(int id);
    Professor findProfessorBySurnameAndName(String surname, String name);
    Professor editProfessor(Professor professor);
    boolean showProfessorProfile();
    List<Subject> getListTeachingSubjects();
}
