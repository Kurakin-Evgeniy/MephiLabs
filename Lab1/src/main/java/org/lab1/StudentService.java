package org.lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentService {
    private final List<Student> students;

    public StudentService() {
        students = new ArrayList<>();
    }

    public StudentService(List<Student> students) {
        this.students = students;
    }

    public void toNextCourseOrRemove() {
        List<Student> forRemoving = new ArrayList<>();

        for (Student student : students) {
            double avgGrade = student.getSubjectGrades().values().stream().collect(Collectors.averagingInt(grade -> grade));

            if (avgGrade < 3) {
                forRemoving.add(student);
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }

        students.removeAll(forRemoving);
    }

    public void printAllStudents() {
        students.forEach(System.out::println);
        System.out.println();
    }

    public static void printStudents(List<Student> students, int course) {
        students.stream().filter(student -> student.getCourse() == course).forEach(student -> System.out.println(student.getFullName()));
        System.out.println();
    }

    public void addSomeStudents() {
        students.add(new Student(
                "Bob",
                "ivt1",
                1,
                Map.of(
                        "math", 1,
                        "english", 2,
                        "physic", 3,
                        "literature", 4
                )
        ));
        students.add(new Student(
                "Eugene",
                "ivt2",
                2,
                Map.of(
                        "math", 5,
                        "english", 5,
                        "physic", 5,
                        "literature", 5
                )
        ));
        students.add(new Student(
                "Richard",
                "spis",
                3,
                Map.of(
                        "math", 2,
                        "english", 2,
                        "physic", 3,
                        "literature", 4
                )
        ));
        students.add(new Student(
                "Joe",
                "ivt1.5",
                2,
                Map.of(
                        "math", 1,
                        "english", 1,
                        "physic", 1,
                        "literature", 1
                )
        ));
        students.add(new Student(
                "Michael",
                "ivt0.5",
                4,
                Map.of(
                        "math", 4,
                        "english", 4,
                        "physic", 4,
                        "literature", 3
                )
        ));
        students.add(new Student(
                "Robin",
                "moa",
                6,
                Map.of(
                        "math", 1,
                        "english", 2,
                        "physic", 4,
                        "literature", 2
                )
        ));
        students.add(new Student(
                "Steve",
                "pri",
                5,
                Map.of(
                        "math", 2,
                        "english", 5,
                        "physic", 1,
                        "literature", 4
                )
        ));
        students.add(new Student(
                "Lancelot",
                "ivt2",
                2,
                Map.of(
                        "math", 2,
                        "english", 2,
                        "physic", 3,
                        "literature", 3
                )
        ));
        students.add(new Student(
                "Friedrich",
                "ivt1",
                3,
                Map.of(
                        "math", 4,
                        "english", 2,
                        "physic", 2,
                        "literature", 3
                )
        ));

    }

    public void clear() {
        students.clear();
    }

    public List<Student> getStudents() {
        return students;
    }
}
