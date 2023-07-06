package az.atlacademy.lesson172;

import java.util.Arrays;
import java.util.Comparator;

public class PlayerApp {
    public static void main(String[] args) {
        Player[] a = {
                new Player(20, "Smith"),
                new Player(15, "Jones"),
                new Player(20, "Jones"),
        };
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        Arrays.sort(a, new ComperatorWIthGrade());
        Arrays.sort(a, new ComperatorWithName());
        Arrays.sort(a, (player1, player2) -> (Integer.compare(player2.score, player1.score)));

        Arrays.sort(a, Comparator.comparing(player -> player.name));
        System.out.println(Arrays.toString(a));
        for (Player player : a) {
            System.out.println(player);
        }
        Arrays.stream(a).forEach(System.out::println);
    }
}
