package az.atlacademy.test;

import java.util.LinkedList;

public class ArraylistTest {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        LinkedList<Integer> a=new LinkedList<>();
        numbers.add(15);
        numbers.add(16);
        numbers.add(19);
        numbers.add(25);
        numbers.add(11);
        numbers.add(1);
        System.out.println(numbers.size());
        System.out.println(numbers.element());
        System.out.println(numbers.get(3));
        System.out.println(numbers);
    }
}
