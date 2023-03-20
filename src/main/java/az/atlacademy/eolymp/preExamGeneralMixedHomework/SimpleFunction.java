package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class SimpleFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double fx = x + Math.sin(x);
        System.out.printf("%.4f", fx);
    }
}
