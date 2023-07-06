package az.atlacademy.lesson16;

import java.util.UUID;

public class BoxApp {
    public static void main(String[] args) {
        Box<Integer> a = method(5);
        System.out.println(a.getData());
        System.out.println(a.isEven());
        System.out.println(a);
        System.out.println("---------------------");
        Box<Double> b = method(5.0);
        System.out.println(b.getData());
        System.out.println(b.isEven());
        System.out.println(b);
        System.out.println("---------------------");
        Box<String> c = method("Hello");
        System.out.println(c.getData());
        System.out.println(c.isEven());
        System.out.println(c);
        System.out.println("---------------------");
    }

    public static Box<Integer> method(Integer a) {
        int num = (int) (Math.random() * 100);
        boolean isEven = (num % 2 == 0);
        return new Box<>(num, isEven);
    }

    public static Box<Double> method(Double a) {
        double num = (Math.random() * 100);
        boolean isEven = (num % 2 == 0);
        return new Box<>(num, isEven);
    }

    public static Box<String> method(String a) {
        int num = (int) (Math.random() * 100);
        return new Box<>(UUID.randomUUID().toString(), true);
    }
}
