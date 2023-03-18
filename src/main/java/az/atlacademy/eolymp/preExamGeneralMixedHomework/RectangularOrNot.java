package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class RectangularOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (pifaqor(a, b, c) || pifaqor(b, a, c) || pifaqor(c, a, b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean pifaqor(int a, int b, int c) {
        return Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2);
    }
}
