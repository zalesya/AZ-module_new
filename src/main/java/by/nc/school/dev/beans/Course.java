package by.nc.school.dev.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/*
@Entity
@Table(name="course", indexes = {
        @Index(columnList = "course_number", unique = true)
})*/
public class Course implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "course_number")
    private int courseNumber;
    /*
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "list_departments"
            ,joinColumns = @JoinColumn(name = "course_id")
            ,inverseJoinColumns = @JoinColumn(name = "department_id")
    )*/
    private List<Department> listDepartments;

    public Course() {
    }

    public Course(int courseNumber, List<Department> listDepartments) {
        this.courseNumber = courseNumber;
        this.listDepartments = new ArrayList<Department>(listDepartments);
    }

    public long getId() {
        return id;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public List<Department> getListDepartments() {
        return listDepartments;
    }

    public void setListDepartments(List<Department> listDepartments) {
        this.listDepartments = new ArrayList<Department>(listDepartments);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (getCourseNumber() != course.getCourseNumber()) return false;
        return getListDepartments().equals(course.getListDepartments());
    }

    @Override
    public int hashCode() {
        int result = getCourseNumber();
        result = 31 * result + getListDepartments().hashCode();
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < listDepartments.size(); i++) {
            builder.append(listDepartments.get(i)).append(" ");
        }
        return "Course{" +
                "courseNumber=" + courseNumber + "\n" +
                "listDepartments: " + builder.toString() + "\n" +
                '}';
    }
}