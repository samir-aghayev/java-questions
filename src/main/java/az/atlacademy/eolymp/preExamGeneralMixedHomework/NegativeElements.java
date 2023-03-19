package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class NegativeElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            double num = scanner.nextDouble();
            if (num < 0) {
                sum += num;
                count++;
            }
        }
        System.out.printf("%d %.2f", count, sum);
    }
}
