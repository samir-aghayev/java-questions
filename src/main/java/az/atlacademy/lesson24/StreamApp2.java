package az.atlacademy.lesson24;

import java.util.ArrayList;
import java.util.List;

public class StreamApp2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Hello");
        stringList.add("World");
        stringList
                .stream()
                .forEach(System.out::println);

        stringList
                .stream()
                .forEach(System.out::println);

        stringList
                .stream()
                .forEach(s -> System.out.println(s.length()));

        stringList
                .stream()
                .filter(s -> s.length() > 3)
                .forEach(System.out::println);

        int sum = stringList
                .stream()
                .filter(s -> s.length() >= 3)
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println(sum);
    }
}
