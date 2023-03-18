package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class TheFirstIsNotGreaterFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
        }
        int c = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] <= 2.5) {
                c = i;
                break;
            }
        }
        if (c == -1) {
            System.out.println("Not Found");
        } else {
            System.out.printf((c + 1) + " " + "%.2f", array[c]);
        }
    }
}
