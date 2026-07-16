// Grandparent class
class Person {
    void displayName() {
        System.out.println("This is a person");
    }
}

// Parent class
class Employee extends Person {
    void work() {
        System.out.println("Employee is working");
    }
}

// Child class
class Manager extends Employee {
    void manageTeam() {
        System.out.println("Manager is managing the team");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Manager m = new Manager();

        m.displayName(); // Inherited from Person
        m.work();        // Inherited from Employee
        m.manageTeam();  // Own method
    }
}