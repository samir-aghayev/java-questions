package az.atlacademy.lesson21;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        Deque<String> words = new LinkedList<>();
        words.add("Hello");
        words.add("CSS");
        words.add("Linkedin");
        System.out.println(words);
        System.out.println(words.peek());
        System.out.println(words.getFirst());
        System.out.println(words.getLast());
        System.out.println(words);
        System.out.println(words.poll());
        System.out.println(words);
        System.out.println(words.pop());
        System.out.println(words);
    }

}
