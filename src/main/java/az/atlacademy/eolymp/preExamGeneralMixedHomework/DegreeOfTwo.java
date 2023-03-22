package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class DegreeOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long degree = 1;
        while (degree < n) {
            degree *= 2;
        }
        if (degree == n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
