package by.nc.school.dev.service.impl;

import by.nc.school.dev.beans.Professor;
import by.nc.school.dev.beans.Subject;
import by.nc.school.dev.repository.ProfessorRepository;
import by.nc.school.dev.service.interfaces.ProfessorService;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class ProfessorServiceImpl implements ProfessorService {
    private ProfessorRepository professorRepository;

    @Override
    public Professor addProfessor(Professor professor) {
        Professor savedProfessor = professorRepository.saveAndFlush(professor);
        return savedProfessor;
    }

    @Override
    public void deleteProfessor(Long id) {
        professorRepository.deleteById(id);
    }

    @Override
    public List<Professor> getListProfessors() {
        return professorRepository.findAll();
    }

    @Override
    public Professor getProfessorById(int id) {
        return professorRepository.findProfessorById(id);
    }

    @Override
    public Professor findProfessorBySurnameAndName(String surname, String name) {
        return professorRepository.findProfessorBySurnameAndName(surname, name);
    }

    @Override
    public Professor editProfessor(Professor professor) {
        return professorRepository.saveAndFlush(professor);
    }

    @Override
    public boolean showProfessorProfile() {
        return false;
    }

    @Override
    public List<Subject> getListTeachingSubjects() {
        return null;
    }

    @Required
    public void setProfessorRepository(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }
}
