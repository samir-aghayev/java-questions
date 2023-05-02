package az.atlacademy.lesson15;

import java.util.Optional;

public class GenericApp {
    public static void main(String[] args) {
        String a = "";
        System.out.println(checkName(a));

        String b = null;
        System.out.println(checkName(b));

        String c = "Hello World";
        System.out.println(checkName(c));
    }

    public static Optional<String> checkName(String s) {
        return (s == null || s.isEmpty()) ? Optional.empty() : Optional.of(s);
    }
}
