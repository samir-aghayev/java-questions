package az.atlacadem.eolymp.Homework_ConditionsLoops;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String reason = switch (num) {
            case 1 -> "Winter";
            case 2 -> "Winter";
            case 3 -> "Spring";
            case 4 -> "Spring";
            case 5 -> "Spring";
            case 6 -> "Summer";
            case 7 -> "Summer";
            case 8 -> "Summer";
            case 9 -> "Autumn";
            case 10 -> "Autumn";
            case 11 -> "Autumn";
            default -> "Winter";
        };
        System.out.println(reason);
    }
}
