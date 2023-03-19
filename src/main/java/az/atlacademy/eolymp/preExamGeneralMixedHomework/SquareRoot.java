package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        System.out.printf("%.3f", Math.sqrt(sum));
    }
}
