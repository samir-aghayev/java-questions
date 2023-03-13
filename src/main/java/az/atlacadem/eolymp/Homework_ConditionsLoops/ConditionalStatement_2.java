package az.atlacadem.eolymp.Homework_ConditionsLoops;

import java.util.Scanner;

public class ConditionalStatement_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        long y;
        if (x >= 10) {
            y = ((long)x * x * x) + (5 * x);
        } else {
            y = ((long)x * x) - (2 * x) + 4;
        }
        System.out.println(y);
    }
}
