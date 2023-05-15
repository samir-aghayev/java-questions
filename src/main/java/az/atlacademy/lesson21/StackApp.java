package az.atlacademy.lesson21;

import java.util.LinkedList;

public class StackApp {
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();
        words.add("Kotlin");
        words.add("is");
        words.add("the");
        words.add("best");
        words.add("programming");
        words.add("language");
        System.out.println(words);
        System.out.println(words.size());
        System.out.println(words);
        System.out.println(words.getFirst());
        System.out.println(words.getLast());
        words.push("Hello");
        System.out.println(words);
        System.out.println(words.peek());
        System.out.println(words);
        System.out.println(words.pop());
        System.out.println(words);
    }
}
