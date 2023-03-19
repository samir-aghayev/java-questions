package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class Function1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double x = scanner.nextDouble();
            double fx = Math.pow(x, 3) + 2 * Math.pow(x, 2) - 3;
            System.out.printf("%.4f\n", fx);
        }
        scanner.close();
    }
}
