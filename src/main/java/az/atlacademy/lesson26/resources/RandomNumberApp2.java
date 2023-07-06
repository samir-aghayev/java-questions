package az.atlacademy.lesson26.resources;

import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumberApp2 {
    public static void main(String[] args) {
        Map<Integer, Integer> numbers = new Random()
                .ints(20, 0, 100)
                .boxed()
                .collect(Collectors.toMap(v -> v, m -> 1, Integer::sum));

        IntSummaryStatistics statistics = numbers
                .keySet()
                .stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

    }
}
