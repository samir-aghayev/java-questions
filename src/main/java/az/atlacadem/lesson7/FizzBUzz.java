package az.atlacadem.lesson7;

import java.util.Scanner;

public class FizzBUzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Fizzbuzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }
    }
}
