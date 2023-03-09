package az.atlacadem.lesson7;

import java.util.Scanner;

public class LoopExerciseApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        int prod = 1;
        for (; num > 0; num /= 10) {
            prod *= (num % 10);
        }
        System.out.println(prod);
    }
}