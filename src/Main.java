import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Anna",20,4.5));
        students.add(new Student(2,"Bob",18,3.4));
        students.add(new Student(3,"Charlie",22,2.0));

        List<Student> filtered = StudentUtils.filterStudents(students, student -> student.getGpa()>=3.0);
        System.out.println("Filtered students: ");
        for (Student student : filtered){
            System.out.println(student.getName()+" "+student.getGpa());
        }

        List<Student> mapped = StudentUtils.mapStudents(students, student -> {
            student.setGpa(student.getGpa() + 0.5);
            return student;
        });
        System.out.println("Mapped students:");
        for (Student student : mapped) {
            System.out.println(student.getName() + " " + student.getGpa());
        }
    }
}