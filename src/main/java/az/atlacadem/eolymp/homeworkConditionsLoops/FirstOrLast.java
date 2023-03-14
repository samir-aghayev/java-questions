package az.atlacadem.eolymp.homeworkConditionsLoops;

import java.util.Scanner;

public class FirstOrLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int first = num / 100;
        int last = num % 10;
        if (first > last) {
            System.out.println(first);
        } else if (first < last) {
            System.out.println(last);
        } else {
            System.out.println("=");
        }
    }
}
