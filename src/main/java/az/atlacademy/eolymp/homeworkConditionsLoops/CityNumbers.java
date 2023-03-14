package az.atlacademy.eolymp.homeworkConditionsLoops;

import java.util.Scanner;

public class CityNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a % 2 == 0 && b % 2 == 0 || (a % 2 == 1 && b % 2 == 1)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
