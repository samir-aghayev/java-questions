package az.atlacademy.lesson18.exp2;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class LinearSearcApp2 {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[15];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Enter one integer: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Optional<Integer> optionalInteger = search(numbers, n);
        System.out.println(optionalInteger);
    }

    public static <T> Optional<Integer> search(T[] numbers, T num) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].equals(num)) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}
