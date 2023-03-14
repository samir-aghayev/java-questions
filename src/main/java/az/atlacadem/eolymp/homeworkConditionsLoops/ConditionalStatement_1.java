package az.atlacadem.eolymp.homeworkConditionsLoops;

import java.util.Scanner;

public class ConditionalStatement_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = 0;
        if (x < 5) {
            y = x * x - 3 * x + 4;
        } else {
            y = x + 7;
        }
        System.out.println(y);
    }
}
