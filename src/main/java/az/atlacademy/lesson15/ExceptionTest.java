package az.atlacademy.lesson15;

import az.atlacademy.birthday.InvalidBirthdayException;

import java.time.LocalDate;

public class ExceptionTest {
    public static void main(String[] args) {
        String s = "Hello world";
        method(s);
        s = null;
        method(s);

        Integer a = 5;
        method(a);
        a = null;
        method(a);

        LocalDate b = LocalDate.now();
        method(b);
        b = null;
        method(b);
    }

    public static void method(String s) {
        if (s == null) {
            throw new InvalidBirthdayException("Invalid input");
        }
    }

    public static void method(Integer s) {
        if (s == null) {
            throw new InvalidBirthdayException("Invalid input");
        }
    }

    public static void method(LocalDate s) {
        if (s == null) {
            throw new InvalidBirthdayException("Invalid input");
        }
    }
}
