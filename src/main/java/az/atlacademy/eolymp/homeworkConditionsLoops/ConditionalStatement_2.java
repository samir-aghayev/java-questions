package az.atlacademy.eolymp.homeworkConditionsLoops;

import java.util.Scanner;

public class ConditionalStatement_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long y;
        if (x < -4) {
            y = x + 5;
        } else if (x <= 7) {
            y = x * x - 3 * x;
        } else {
            y = x * x * x + 2 * x;
        }
        System.out.println(y);
    }
}
