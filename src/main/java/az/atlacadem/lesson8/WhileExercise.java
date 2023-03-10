package az.atlacadem.lesson8;

import java.util.Scanner;

public class WhileExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        System.out.println(count);
    }
}
