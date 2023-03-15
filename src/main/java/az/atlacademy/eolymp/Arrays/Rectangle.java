package az.atlacademy.eolymp.Arrays;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
