interface Payable {
    void processPayment(double amount);
    String getPaymentDetails();
    void refundPayment(double amount);
}

interface Taxable {
    double calculateTax(double amount);
    String getTaxDetails();
}

interface Loggable {
    void logActivity(String action);
}

class CreditCardPayment implements Payable, Taxable, Loggable {
    private String cardNumber;
    private String cardHolderName;
    private double taxRate;

    // Constructor
    public CreditCardPayment(String cardNumber,
                             String cardHolderName,
                             double taxRate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.taxRate = taxRate;
    }

    @Override
    public void processPayment(double amount) {
        double tax = calculateTax(amount);
        double totalAmount = amount + tax;

        System.out.println("Processing credit card payment...");
        System.out.println("Amount: $" + amount);
        System.out.println("Tax: $" + tax);
        System.out.println("Total Amount: $" + totalAmount);

        logActivity("Payment of $" + totalAmount + " processed.");
    }

    @Override
    public String getPaymentDetails() {
        return "Card Holder: " + cardHolderName +
               "\nCard Number: " + cardNumber;
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding $" + amount +
                           " to " + cardHolderName);
        logActivity("Refund of $" + amount + " completed.");
    }

    @Override
    public double calculateTax(double amount) {
        return amount * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate: " + (taxRate * 100) + "%";
    }

    @Override
    public void logActivity(String action) {
        System.out.println("LOG: " + action);
    }
}

public class Main {
    public static void main(String[] args) {

        CreditCardPayment payment =
                new CreditCardPayment(
                        "1234-5678-9012-3456",
                        "Pavan",
                        0.18);

        System.out.println("----- Payment Details -----");
        System.out.println(payment.getPaymentDetails());

        System.out.println("\n----- Tax Details -----");
        System.out.println(payment.getTaxDetails());

        System.out.println("\n----- Processing Payment -----");
        payment.processPayment(1000);

        System.out.println("\n----- Refund Payment -----");
        payment.refundPayment(500);
    }
}