package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class MaximumOfAbsoluteValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double max = -1;
        for (int i = 0; i < n; i++) {
            double num = scanner.nextDouble();
            if (max < Math.abs(num)) {
                max = Math.abs(num);
            }
        }
        System.out.printf("%.2f", max);
    }
}
