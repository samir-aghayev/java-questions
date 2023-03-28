package az.atlacademy.lesson9;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        printDigit(n);
    }

    public static void printDigit(int n) {
        while (n > 0) {
            System.out.print(n % 10 + " ");
            n /= 10;
        }
    }
}
