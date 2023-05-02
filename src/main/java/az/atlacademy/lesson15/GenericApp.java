package az.atlacademy.lesson15;

import java.util.Optional;

public class GenericApp {
    public static void main(String[] args) {
        String a = "";
        System.out.println(checkName(a));
    }

    public static Optional<String> checkName(String s) {
        return (s.isEmpty()) ? Optional.empty() : Optional.of(s);
    }
}
