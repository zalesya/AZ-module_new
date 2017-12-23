package by.nc.school.dev.beans;

import by.nc.school.dev.beans.additionalClasses.Task;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*@Entity
@Table(name="department")*/
public class Department implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "department_name")
    private String departmentName;
    @Column(name = "head_department_info")
    private Professor headDepartmentInfo;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "all_professors_in_department"
            ,joinColumns = @JoinColumn(name = "department_id")
            ,inverseJoinColumns = @JoinColumn(name = "professor_id")
    )
    private List<Professor> listProfessors;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "special_courses"
            ,joinColumns = @JoinColumn(name = "department_id")
            ,inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
    private List<Subject> listSpecialCourses;
    private List<Task> listControlTasks;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "groups_in_department"
            ,joinColumns = @JoinColumn(name = "department_id")
            ,inverseJoinColumns = @JoinColumn(name = "group_id")
    )
    private List<Group> listGroup;

    public Department() {
    }

    public Department(String departmentName, Professor headDepartmentInfo, List<Professor> listProfessors,
                      List<Subject> listSpecialCourses, List<Task> listControlTasks, List<Group> listGroup) {
        this.departmentName = departmentName;
        this.headDepartmentInfo = headDepartmentInfo;
        this.listProfessors = new ArrayList<Professor>(listProfessors);
        this.listSpecialCourses = new ArrayList<Subject>(listSpecialCourses);
        this.listControlTasks = new ArrayList<Task>(listControlTasks);
        this.listGroup = listGroup;
    }

    public long getId() {
        return id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Professor getHeadDepartmentInfo() {
        return headDepartmentInfo;
    }

    public void setHeadDepartmentInfo(Professor headDepartmentInfo) {
        this.headDepartmentInfo = headDepartmentInfo;
    }

    public List<Professor> getListProfessors() {
        return listProfessors;
    }

    public void setListProfessors(List<Professor> listProfessors) {
        this.listProfessors = new ArrayList<Professor>(listProfessors);
    }

    public List<Subject> getListSpecialCourses() {
        return listSpecialCourses;
    }

    public void setListSpecialCourses(List<Subject> listSpecialCourses) {
        this.listSpecialCourses = new ArrayList<Subject>(listSpecialCourses);
    }

    public List<Task> getListControlTasks() {
        return listControlTasks;
    }

    public void setListControlTasks(List<Task> listControlTasks) {
        this.listControlTasks = new ArrayList<Task>(listControlTasks);
    }

    public List<Group> getListGroup() {
        return listGroup;
    }

    public void setListGroup(List<Group> listGroup) {
        this.listGroup = new ArrayList<Group>(listGroup);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (!getDepartmentName().equals(that.getDepartmentName())) return false;
        if (!getHeadDepartmentInfo().equals(that.getHeadDepartmentInfo())) return false;
        if (!getListProfessors().equals(that.getListProfessors())) return false;
        if (!getListSpecialCourses().equals(that.getListSpecialCourses())) return false;
        if (!getListControlTasks().equals(that.getListControlTasks())) return false;
        return getListGroup().equals(that.getListGroup());
    }

    @Override
    public int hashCode() {
        int result = getDepartmentName().hashCode();
        result = 31 * result + getHeadDepartmentInfo().hashCode();
        result = 31 * result + getListProfessors().hashCode();
        result = 31 * result + getListSpecialCourses().hashCode();
        result = 31 * result + getListControlTasks().hashCode();
        result = 31 * result + getListGroup().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", headDepartmentInfo=" + headDepartmentInfo +
                ", listProfessors=" + listProfessors +
                ", listSpecialCourses=" + listSpecialCourses +
                ", listControlTasks=" + listControlTasks +
                '}';
    }
}