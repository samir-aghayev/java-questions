package az.atlacademy.lesson15;

import java.time.LocalDate;

public class ExceptionTest2 {
    public static void main(String[] args) {
        String s = "Hello world";
        method(s);
        s = null;
        method(s);

        Integer a = 5;
        method(a);
        System.out.println(a.toString());
        a = null;
        method(a);

        LocalDate b = LocalDate.now();
        method(b);
        b = null;
        method(b);
    }

    public static <E> E method(E s) {
        if (s == null) {
            throw new NullPointerException("Invalid input");
        }else{
            return s;
        }
    }
}
