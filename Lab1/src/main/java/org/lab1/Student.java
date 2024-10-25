package src.main.java.org.lab1;

import java.util.Map;

public class Student {
    private String fullName;
    private String group;
    private Integer course;
    private Map<String, Integer> subjectGrades;

    public Student() {
    }

    public Student(String fullName, String group, Integer course, Map<String, Integer> subjectGrades) {
        this.fullName = fullName;
        this.group = group;
        this.course = course;
        this.subjectGrades = subjectGrades;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Map<String, Integer> getSubjectGrades() {
        return subjectGrades;
    }

    public void setSubjectGrades(Map<String, Integer> subjectGrades) {
        this.subjectGrades = subjectGrades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", subjectGrades=" + subjectGrades +
                '}';
    }
}
