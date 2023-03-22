package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class Function5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        long fx = x * (long) y * z + x + (long) y * y + (long)z * z * z;
        System.out.println(fx);
    }
}
