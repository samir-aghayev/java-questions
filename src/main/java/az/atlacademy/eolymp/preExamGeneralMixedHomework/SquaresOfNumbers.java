package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class SquaresOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int square = 1;
        while (square * square <= n) {
            System.out.print(square*square+" ");
            square++;
        }
    }
}
