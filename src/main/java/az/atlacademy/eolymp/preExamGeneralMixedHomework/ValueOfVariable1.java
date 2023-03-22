package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class ValueOfVariable1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = Math.pow(x, 3) - 5 * Math.pow(x, 2) / 7 + 9 * x - 3 / x + 1;
        System.out.printf("%.3f", y);
    }
}
