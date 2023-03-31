package az.atlacademy.quiz;

import java.util.Scanner;

public class QuestionA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double max = 0;
        double salary;
        while (scanner.hasNextDouble()) {
            salary = scanner.nextDouble();
            if (max < salary) {
                max = salary;
            }
        }
        System.out.printf("%.2f", max);
    }
}
