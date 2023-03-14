package az.atlacademy.lesson8;

import java.util.Scanner;

public class WhileExercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        while (num > 0) {
            if ((num % 10) % 2 == 0) {
                sum += num % 10;
            }
            num /= 10;
        }
        System.out.println(sum);
    }
}
