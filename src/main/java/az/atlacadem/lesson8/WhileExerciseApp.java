package az.atlacadem.lesson8;

import java.util.Scanner;

public class WhileExerciseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (true) {
            if (num > 0) {
                while (num > 0) {
                    System.out.println(num);
                    System.out.println(num % 10);
                    num /= 10;
                }
            } else if (num < 0) {
                System.out.println(num);
                break;
            }
            break;
        }
    }
}
