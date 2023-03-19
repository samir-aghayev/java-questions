package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class Force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int force = (int) (Math.pow(2, k) + Math.pow(2, n));
        System.out.println(force);
    }
}
