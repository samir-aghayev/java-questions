package az.atlacademy.lesson26;

import java.util.Collections;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumbersApp {
    public static void main(String[] args) {
        Map<Integer, Integer> numbers = new Random()
                .ints(100, 0, 25)
                .boxed()
                .collect(Collectors.toMap(num -> num, v -> 1, Integer::sum));
        int maxKey = Collections.max(numbers.keySet());
        int minKey = Collections.min(numbers.keySet());
        System.out.println(numbers);
        System.out.println("En boyuk eded: " + maxKey + ", tekrar sayi " + numbers.get(maxKey));
        System.out.println("En kicik eded: " + minKey + ", tekrar sayi " + numbers.get(minKey));
    }
}
