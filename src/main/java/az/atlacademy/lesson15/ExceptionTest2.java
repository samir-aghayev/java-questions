package az.atlacademy.lesson15;

import az.atlacademy.birthday.InvalidBirthdayException;

import java.time.LocalDate;

public class ExceptionTest2 {
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

    public static <E> void method(E s) {
        if (s == null) {
            throw new InvalidBirthdayException("Invalid input");
        }
    }
}
