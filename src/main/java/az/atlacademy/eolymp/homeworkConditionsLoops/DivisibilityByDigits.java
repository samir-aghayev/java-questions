package az.atlacademy.eolymp.homeworkConditionsLoops;

import java.util.Scanner;

public class DivisibilityByDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num1 = num % 10;
        int num2 = (num / 10) % 10;
        int num3 = ((num / 100) % 10);
        int num4 = num / 1000;
        if (num1 <= 0 || num2 <= 0 || num3 <= 0 || num4 <= 0) {
            System.out.println("NO");
        } else if (num % num1 == 0 && num % num2 == 0 && num % num3 == 0 && num % num4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
