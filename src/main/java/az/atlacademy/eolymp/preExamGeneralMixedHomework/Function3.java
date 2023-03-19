package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class Function3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double fx = Math.pow(x, 2) + Math.sin(x * y) - Math.pow(y, 2);
            System.out.printf("%.4f\n", fx);
        }
        scanner.close();
    }
}
