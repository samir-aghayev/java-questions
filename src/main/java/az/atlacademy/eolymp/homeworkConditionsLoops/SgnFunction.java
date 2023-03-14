package az.atlacademy.eolymp.homeworkConditionsLoops;

import java.util.Scanner;

public class SgnFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y;
        if (x > 0) y = 1;
        else if (x < 0) {
            y = -1;
        } else {
            y = 0;
        }
        System.out.println(y);
    }
}
