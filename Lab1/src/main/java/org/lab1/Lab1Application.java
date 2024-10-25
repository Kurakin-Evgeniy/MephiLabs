package src.main.java.org.lab1;


public class Lab1Application {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        studentService.addSomeStudents();
        StudentService.printStudents(studentService.getStudents(), 2);
        studentService.toNextCourseOrRemove();
        StudentService.printStudents(studentService.getStudents(), 3);

    }
}