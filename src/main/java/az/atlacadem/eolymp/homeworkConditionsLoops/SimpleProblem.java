package az.atlacadem.eolymp.homeworkConditionsLoops;

import java.util.Scanner;

public class SimpleProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println((a / 10) + " " + (a % 10));
    }
}
