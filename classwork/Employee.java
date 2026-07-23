// Parent class
class Employee {
    public void work() {
        System.out.println("Employee is working.");
    }
}

// Child class 1
class Developer extends Employee {
    @Override
    public void work() {
        System.out.println("Developer writes code.");
    }
}

// Child class 2
class Tester extends Employee {
    @Override
    public void work() {
        System.out.println("Tester tests the software.");
    }
}

// Child class 3
class Manager extends Employee {
    @Override
    public void work() {
        System.out.println("Manager manages the team.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Developer();
        Employee e2 = new Tester();
        Employee e3 = new Manager();

        e1.work();
        e2.work();
        e3.work();
    }
}