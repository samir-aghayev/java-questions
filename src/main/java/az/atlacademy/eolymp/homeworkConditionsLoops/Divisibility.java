package az.atlacademy.eolymp.homeworkConditionsLoops;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x % y == 0) {
            System.out.println("Divisible");
        } else {
            System.out.println(x / y + " " + (x % y));
        }
    }
}
