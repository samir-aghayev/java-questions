package az.atlacademy.lesson21;

import java.util.LinkedList;
import java.util.Queue;

public class StackApp {

    public static void main(String[] args) {
        Queue<String> words = new LinkedList<>();
        words.add("Java");
        words.add("Hello");
        words.add("world");
        System.out.println("words.size() "+words.size());
        System.out.println("words.element() "+words.element());
        System.out.println(words);
        System.out.println(words.peek());
        System.out.println(words);
        words.offer("salam");
        System.out.println(words);
        words.remove();
        System.out.println(words);
    }

}
