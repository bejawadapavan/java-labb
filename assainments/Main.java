import java.util.ArrayList;
import java.util.Scanner;

// Encapsulation Class
class CourseCode {
    private String name;
    private String code;
    private int credits;

    public CourseCode(String name, String code, int credits) {
        this.name = name;
        this.code = code;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getCredits() {
        return credits;
    }

    public void display() {
        System.out.println("Course Name : " + name);
        System.out.println("Course Code : " + code);
        System.out.println("Credits     : " + credits);
        System.out.println("-------------------------");
    }
}

public class Main {

    static ArrayList<CourseCode> courses = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // Add Course
    public static void addCourse() {

        System.out.print("Enter Course Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course Code: ");
        String code = sc.nextLine();

        int credits;

        try {
            System.out.print("Enter Credits: ");
            credits = sc.nextInt();
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid input! Credits should be a number.");
            sc.nextLine();
            return;
        }

        courses.add(new CourseCode(name, code, credits));
        System.out.println("Course Added Successfully!");
    }

    // Remove Course
    public static void removeCourse() {

        System.out.print("Enter Course Code to Remove: ");
        String code = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCode().equalsIgnoreCase(code)) {
                courses.remove(i);
                found = true;
                System.out.println("Course Removed Successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Course Code Not Found!");
        }
    }

    // Display Courses
    public static void displayCourses() {

        if (courses.isEmpty()) {
            System.out.println("No Courses Registered.");
            return;
        }

        System.out.println("\nRegistered Courses:");

        for (CourseCode c : courses) {
            c.display();
        }
    }

    public static void main(String[] args) {

        int choice = 0;

        do {

            System.out.println("\n===== Course Registration System =====");
            System.out.println("1. Add Course");
            System.out.println("2. Remove Course");
            System.out.println("3. Display Courses");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    addCourse();
                    break;

                case 2:
                    removeCourse();
                    break;

                case 3:
                    displayCourses();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}