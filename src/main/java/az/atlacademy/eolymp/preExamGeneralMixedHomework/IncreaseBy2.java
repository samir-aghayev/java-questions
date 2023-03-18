package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class IncreaseBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a >= 0) {
                a += 2;
                System.out.print(a + " ");
            } else {
                System.out.print(a + " ");
            }
        }
    }
}
