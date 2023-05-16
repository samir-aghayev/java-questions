package az.atlacademy.lesson22;

import java.util.LinkedList;
import java.util.Queue;

public class OrderApp {
    public static void main(String[] args) {
        Queue<Order> order = new LinkedList<>();
        makerOrder(order);
        makerOrder(order);
        makerOrder(order);
        makerOrder(order);
        System.out.println(order);
        proccessOrder(order);
        System.out.println(order);
    }

    public static void makerOrder(Queue<Order> order) {
        order.add(new Order());
    }

    public static void proccessOrder(Queue<Order> order) {
        order.poll();
    }
}
