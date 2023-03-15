package az.atlacademy.eolymp.homeworkConditionsLoops;

import java.util.Scanner;

public class NoneOfTheTwoConditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if ((n % 2 == 0 && n > 0) || (n % 2 !=0 && n < 0)) {
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
