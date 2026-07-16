class BusinessLogic {

    // Returns a whole number
    public int calculateTotal(int a, int b) {
        return a + b;
    }

    // Returns a decimal value
    public double calculateAverage(int total, int subjects) {
        return (double) total / subjects;
    }

    // Returns true or false
    public boolean isEligible(int age) {
        return age >= 18;
    }

    // Returns text
    public String getStudentName() {
        return "pavan";
    }

    // Returns a single character
    public char getGrade() {
        return 'A';
    }

    // Performs an action only
    public void displayMessage() {
        System.out.println("Welcome to Business Logic Program");
    }

    public static void main(String[] args) {

        BusinessLogic obj = new BusinessLogic();

        obj.displayMessage();

        int total = obj.calculateTotal(80, 90);
        System.out.println("Total Marks: " + total);

        double average = obj.calculateAverage(total, 2);
        System.out.println("Average Marks: " + average);

        boolean eligible = obj.isEligible(20);
        System.out.println("Eligible to Vote: " + eligible);

        String name = obj.getStudentName();
        System.out.println("Student Name: " + name);

        char grade = obj.getGrade();
        System.out.println("Grade: " + grade);
    }
}
