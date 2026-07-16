class PayPalPayment {

    public void processPayment(double amount) {
        System.out.println("PayPal Payment Successful");
        System.out.println("Amount Paid: ₹" + amount);
    }

    public String getPaymentDetails() {
        return "Payment Method: PayPal";
    }
}

class CreditCardPayment {

    public void processPayment(double amount) {
        System.out.println("Credit Card Payment Successful");
        System.out.println("Amount Paid: ₹" + amount);
    }

    public String getPaymentDetails() {
        return "Payment Method: Credit Card";
    }
}

public class PaymentDemo {

    public static void main(String[] args) {

        PayPalPayment paypal = new PayPalPayment();
        paypal.processPayment(1500);
        System.out.println(paypal.getPaymentDetails());

        System.out.println();

        CreditCardPayment card = new CreditCardPayment();
        card.processPayment(2500);
        System.out.println(card.getPaymentDetails());
    }
}