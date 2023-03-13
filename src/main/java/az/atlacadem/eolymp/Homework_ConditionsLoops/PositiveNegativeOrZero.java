package az.atlacadem.eolymp.Homework_ConditionsLoops;

import java.util.Scanner;

public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println("Positive");
        } else if (a < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
