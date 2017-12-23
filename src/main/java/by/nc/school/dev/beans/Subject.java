package by.nc.school.dev.beans;

import by.nc.school.dev.beans.additionalClasses.Curriculum;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="subjects")
public class Subject implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "subject_name")
    private String subjectName;
    @Column(name = "professor_name")
    private Professor subjectProfessor;
    @Column(name = "optional_subject_hours")
    private int optionalSubjectHours;
    @Column(name = "credit")
    private boolean isCredit;
    @Column(name = "exam")
    private boolean isExam;
    /*
    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(
            name = "subject_study_plan_list"
            ,joinColumns = @JoinColumn(name = "subject_id")
            ,inverseJoinColumns = @JoinColumn(name = "plan_list_id")
    )
    private List<Curriculum> subjectStudyPlanList;
*/
    public Subject() {
    }

    public Subject(boolean isCredit, boolean isExam, int optionalSubjectHours, String subjectName,
                   Professor subjectProfessor, List<Curriculum> subjectStudyPlanList) {
        this.isCredit = isCredit;
        this.isExam = isExam;
        this.optionalSubjectHours = optionalSubjectHours;
        this.subjectName = subjectName;
        this.subjectProfessor = subjectProfessor;
  //      this.subjectStudyPlanList = new ArrayList<Curriculum>(subjectStudyPlanList);
    }

    public long getId() {
        return id;
    }

    public boolean isCredit() {
        return isCredit;
    }

    public void setCredit(boolean credit) {
        isCredit = credit;
    }

    public boolean isExam() {
        return isExam;
    }

    public void setExam(boolean exam) {
        isExam = exam;
    }

    public int getOptionalSubjectHours() {
        return optionalSubjectHours;
    }

    public void setOptionalSubjectHours(int optionalSubjectHours) {
        this.optionalSubjectHours = optionalSubjectHours;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Professor getSubjectProfessor() {
        return subjectProfessor;
    }

    public void setSubjectProfessor(Professor subjectProfessor) {
        this.subjectProfessor = subjectProfessor;
    }
/*
    public List<Curriculum> getSubjectStudyPlanList() {
        return subjectStudyPlanList;
    }

    public void setSubjectStudyPlanList(List<Curriculum> subjectStudyPlanList) {
        this.subjectStudyPlanList = new ArrayList<Curriculum>(subjectStudyPlanList);
    }
*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subject subject = (Subject) o;

        if (isCredit() != subject.isCredit()) return false;
        if (isExam() != subject.isExam()) return false;
        if (getOptionalSubjectHours() != subject.getOptionalSubjectHours()) return false;
        if (!getSubjectName().equals(subject.getSubjectName())) return false;
        if (!getSubjectProfessor().equals(subject.getSubjectProfessor())) return false;
        return true;//getSubjectStudyPlanList().equals(subject.getSubjectStudyPlanList());
    }

    @Override
    public int hashCode() {
        int result = (isCredit() ? 1 : 0);
        result = 31 * result + (isExam() ? 1 : 0);
        result = 31 * result + getOptionalSubjectHours();
        result = 31 * result + getSubjectName().hashCode();
        result = 31 * result + getSubjectProfessor().hashCode();
     //   result = 31 * result + getSubjectStudyPlanList().hashCode();
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
       // for (int i = 0; i < subjectStudyPlanList.size(); i++) {
       //     builder.append(subjectStudyPlanList.get(i)).append(" ");
       // }
        return "Subject{" +
                "isCredit=" + isCredit + "\n" +
                "isExam=" + isExam + "\n" +
                "optionalSubjectHours=" + optionalSubjectHours + "\n" +
                "subjectName='" + subjectName + "\n" +
                "subjectProfessor=" + subjectProfessor + "\n" +
                "subjectStudyPlanList=" + builder.toString() + "\n" +
                '}';
    }
}