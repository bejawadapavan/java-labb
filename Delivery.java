class Delivery {
    public void deliver() {
        System.out.println("Delivering...");
    }
}

class StandardDelivery extends Delivery {
    @Override
    public void deliver() {
        System.out.println("Delivered in 3-5 days.");
    }
}

class ExpressDelivery extends Delivery {
    @Override
    public void deliver() {
        System.out.println("Delivered in 1 day.");
    }
}

class SameDayDelivery extends Delivery {
    @Override
    public void deliver() {
        System.out.println("Delivered within hours.");
    }
}

public class DeliveryDemo {
    public static void main(String[] args) {
        Delivery d;

        d = new StandardDelivery();
        d.deliver();

        d = new ExpressDelivery();
        d.deliver();

        d = new SameDayDelivery();
        d.deliver();
    }
}