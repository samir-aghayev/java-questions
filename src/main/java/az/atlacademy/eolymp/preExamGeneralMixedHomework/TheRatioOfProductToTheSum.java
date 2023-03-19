package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class TheRatioOfProductToTheSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int prod = 1;
        double sum = 0;
        while (n > 0) {
            int temp = n % 10;
            prod *= temp;
            sum += temp;
            n /= 10;
        }
        System.out.printf("%.3f", (prod / sum));
    }
}
