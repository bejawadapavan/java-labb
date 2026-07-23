import java.util.Scanner;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            students[i] = new Student(name, marks);
        }

        // Display students with marks > 60
        System.out.println("\nStudents with Marks > 60:");
        boolean found = false;

        for (Student s : students) {
            if (s.marks > 60) {
                System.out.println("Name: " + s.name + ", Marks: " + s.marks);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No student has marks greater than 60.");
        }

        sc.close();
    }
}