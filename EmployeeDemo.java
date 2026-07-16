interface Employee {
    void work();
    double calculateSalary();
}

class SoftwareEngineer implements Employee {

    String name = "pavan";
    double monthlySalary = 50000;

    public void work() {
        System.out.println("Employee Name: " + name);
        System.out.println("Working as a Software Engineer.");
    }

    public double calculateSalary() {
        return monthlySalary;
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        SoftwareEngineer emp = new SoftwareEngineer();

        emp.work();
        System.out.println("Monthly Salary: ₹" + emp.calculateSalary());
    }
}