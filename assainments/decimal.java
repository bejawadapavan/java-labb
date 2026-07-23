import java.math.BigDecimal;

public class decimal {
    public static void main(String[] args) {

        BigDecimal price = new BigDecimal("999.99");
        BigDecimal taxRate = new BigDecimal("0.18");

        BigDecimal tax = price.multiply(taxRate);
        BigDecimal total = price.add(tax);

        System.out.println("Price: " + price);
        System.out.println("Tax Rate: " + taxRate);
        System.out.println("Tax: " + tax);
        System.out.println("Total Price: " + total);
    }
}