package az.atlacademy.lesson19;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Consumer;

public class SearchApp {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[15];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(numbers));
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Optional<Integer> a = search(numbers, n);
        a.ifPresent(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        a.ifPresent(integer -> System.out.println(integer));

        a.ifPresent(System.out::println);

        System.out.println(a);
    }

    private static <T> Optional<Integer> search(T[] numbers, T n) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].equals(n)) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}
