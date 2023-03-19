package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class OddElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
