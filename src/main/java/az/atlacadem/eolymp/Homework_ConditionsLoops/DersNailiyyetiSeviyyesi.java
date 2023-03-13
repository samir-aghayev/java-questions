package az.atlacadem.eolymp.Homework_ConditionsLoops;

import java.util.Scanner;

public class DersNailiyyetiSeviyyesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int point = scanner.nextInt();
        if (point <= 3) {
            System.out.println("Initial");
        } else if (point <= 6) {
            System.out.println("Average");
        } else if (point <= 9) {
            System.out.println("Sufficient");
        } else if (point <= 12) {
            System.out.println("High");
        }
    }
}
