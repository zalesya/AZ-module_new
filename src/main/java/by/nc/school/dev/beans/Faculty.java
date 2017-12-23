package by.nc.school.dev.beans;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*@Entity
@Table(name="faculty", indexes = {
        @Index(columnList = "faculty_name", unique = true)
})*/
public class Faculty implements Serializable{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "faculty_name")
    private String facultyName;
    @Column(name = "dean_name")
    private Professor deanInfo;
    @Column(name = "praepostor_faculty_name")
    private Student praepostorFacultyInfo;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "list_courses"
            ,joinColumns = @JoinColumn(name = "faculty_id")
            ,inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> listCourses;

    public Faculty() {
    }

    public Faculty(String facultyName, Professor deanInfo, Student praepostorFacultyInfo,
                   List<Course> listCourses) {
        this.facultyName = facultyName;
        this.deanInfo = deanInfo;
        this.praepostorFacultyInfo = praepostorFacultyInfo;
        this.listCourses = new ArrayList<Course>(listCourses);
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public Professor getDeanInfo() {
        return deanInfo;
    }

    public void setDeanInfo(Professor deanInfo) {
        this.deanInfo = deanInfo;
    }

    public Student getPraepostorFacultyInfo() {
        return praepostorFacultyInfo;
    }

    public void setPraepostorFacultyInfo(Student praepostorFacultyInfo) {
        this.praepostorFacultyInfo = praepostorFacultyInfo;
    }

    public List<Course> getListCourses() {
        return listCourses;
    }

    public void setListCourses(List<Course> listCourses) {
        this.listCourses = new ArrayList<Course>(listCourses);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Faculty faculty = (Faculty) o;

        if (!getFacultyName().equals(faculty.getFacultyName())) return false;
        if (!getDeanInfo().equals(faculty.getDeanInfo())) return false;
        if (!getPraepostorFacultyInfo().equals(faculty.getPraepostorFacultyInfo())) return false;
        return getListCourses().equals(faculty.getListCourses());
    }

    @Override
    public int hashCode() {
        int result = getFacultyName().hashCode();
        result = 31 * result + getDeanInfo().hashCode();
        result = 31 * result + getPraepostorFacultyInfo().hashCode();
        result = 31 * result + getListCourses().hashCode();
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < listCourses.size(); i++) {
            builder.append(listCourses.get(i)).append(" ");
        }
        return "Faculty{" +
                "facultyName='" + facultyName + "\n" +
                "deanInfo=" + deanInfo + "\n" +
                "praepostorFacultyInfo=" + praepostorFacultyInfo + "\n" +
                "listCourses=" + builder.toString() + "\n" +
                '}';
    }

        public long getId() {
            return id;
        }
}