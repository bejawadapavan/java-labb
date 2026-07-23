public class Main1 {
    public static void main(String[] args) {

        double price = 999.99;
        double taxRate = 0.180;

        double tax = price * taxRate;
        double total = price + tax;

        System.out.println("Price: " + price);
        System.out.println("Tax Rate: " + taxRate);
        System.out.println("Tax: " + tax);
        System.out.println("Total Price: " + total);
    }
}