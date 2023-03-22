package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt == n) {
            System.out.println(sqrt);
        } else {
            System.out.println("No");
        }
    }
}
