package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class SumOfSquares2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            sum += (i * i);
        }
        System.out.println(sum);
    }
}
