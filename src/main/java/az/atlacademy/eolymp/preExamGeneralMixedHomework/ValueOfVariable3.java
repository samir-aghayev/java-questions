package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class ValueOfVariable3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = ((Math.pow(x, 2) + 3 * x - 4) / (2 * x - 3)) - ((x + 2) / (Math.pow(x, 2) - 5 * x + 7));
        System.out.printf("%.3f", y);
    }
}
