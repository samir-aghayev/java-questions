package az.atlacademy.lesson18.exp2;

import java.util.Optional;
import java.util.Scanner;

public class LinearSearchApp {

    public static void main(String[] args) {
        Integer[] numbers = new Integer[15];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println("Enter one integer: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Optional<Integer> integer = search(numbers, n);

    }

    public static <T> Optional search(T[] a, T b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(b)) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}
