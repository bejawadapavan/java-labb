import java.util.*;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Marks: " + marks;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Rajesh", 75),
                new Student("Anil", 58),
                new Student("Priya", 92),
                new Student("Ravi", 60),
                new Student("Kiran", 85)
        );

        // 1. Chain filter + map + collect
        List<String> names = students.stream()
                .filter(s -> s.getMarks() > 60)
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println("Students with Marks > 60:");
        System.out.println(names);

        // 2. Find student with highest marks
        Student topStudent = students.stream()
                .max(Comparator.comparingInt(Student::getMarks))
                .orElse(null);

        System.out.println("\nStudent with Highest Marks:");
        System.out.println(topStudent);
    }
}