package az.atlacademy.lesson9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Method {
    public static void main(String[] args) {
        printDigit(1234);
    }

    public static void printDigit(int n) {
        while (n > 0) {
            System.out.print(n % 10 + " ");
            n /= 10;
        }
    }
}
