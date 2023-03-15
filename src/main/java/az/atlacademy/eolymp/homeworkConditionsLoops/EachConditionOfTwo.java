package az.atlacademy.eolymp.homeworkConditionsLoops;

import java.util.Scanner;

public class EachConditionOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 6 == 0 && (n / 10 > -10 && n / 10 != 0 && n / 10 < 10)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
