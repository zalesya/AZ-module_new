package by.nc.school.dev.repository;

import by.nc.school.dev.beans.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    Professor findProfessorById(long id);
    Professor findProfessorBySurnameAndName(String surname, String name);
}
