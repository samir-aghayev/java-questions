package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class ThoseThatAreDivisibleBy6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num > 0 && num % 6 == 0) {
                sum += num;
                count++;
            }
        }
        System.out.println(count + " " + sum);
    }
}
