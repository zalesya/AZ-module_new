package by.nc.school.dev.repository;

import by.nc.school.dev.beans.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByNumberRecordBook(long numberRecordBook);

    Student findById(long id);
}
