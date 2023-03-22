package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class Function4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        long fx = 1 + x + (long) x * x;
        System.out.println(fx);
    }
}
