package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class SumAndAmount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            sum += num;
            n++;
        }
        System.out.print(n + " " + sum);
    }
}
