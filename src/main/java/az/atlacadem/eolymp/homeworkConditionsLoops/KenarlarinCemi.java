package az.atlacadem.eolymp.homeworkConditionsLoops;

import java.util.Scanner;

public class KenarlarinCemi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int first = num / 1000;
        int last = num % 10;
        System.out.println(first + last);
    }
}
