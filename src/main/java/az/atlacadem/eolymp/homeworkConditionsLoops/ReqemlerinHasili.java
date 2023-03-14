package az.atlacadem.eolymp.homeworkConditionsLoops;

import java.util.Scanner;

public class ReqemlerinHasili {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int first = num / 100;
        int second=(num/10)%10;
        int last = num % 10;
        System.out.println(first*second*last);
    }
}
