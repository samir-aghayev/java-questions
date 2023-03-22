package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class ValueOfVariable5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = (2 * x / Math.sqrt(Math.pow(x, 2) + 1)) - (Math.sqrt(Math.pow(x, 2) + 1) / Math.pow(x, 3));
        System.out.printf("%.3f", y);
    }
}
