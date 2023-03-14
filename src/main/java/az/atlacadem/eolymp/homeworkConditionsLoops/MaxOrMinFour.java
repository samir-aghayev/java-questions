package az.atlacadem.eolymp.homeworkConditionsLoops;

import java.util.Scanner;

public class MaxOrMinFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(Math.max(Math.max(a, b), Math.max(c, d)));
    }
}
