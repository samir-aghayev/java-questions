package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a + b);
        }
    }
}
