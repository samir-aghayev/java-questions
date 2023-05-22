package az.atlacademy.lesson25;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class RndomApp {
    public static void main(String[] args) {
        List<Integer> evenNums = new Random()
                .ints(20, 0, 100)
                .filter(value -> value % 2 == 0)
                .boxed()
                .toList();
        System.out.println(evenNums);

        Set<Integer> collect = evenNums.stream()
                .filter(num -> num > 10 && num < 30)
                .collect(Collectors.toSet());
        System.out.println(collect);
    }
}
