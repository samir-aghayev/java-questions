package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class SumOfOddSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int sum = 0;
            int n = scanner.nextInt();
            for (int j = 1; j <= n; j += 2) {
                sum += j;
            }
            System.out.println(sum);
        }
    }
}
