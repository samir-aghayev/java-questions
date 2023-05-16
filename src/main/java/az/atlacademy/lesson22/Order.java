package az.atlacademy.lesson22;

public class Order {
    private int orderId;

    public Order() {
        orderId = (int) (Math.random() * 100);
    }

    @Override
    public String toString() {
        return "{orderId = %d}".formatted(orderId);
    }
}
