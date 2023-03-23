package az.atlacademy.games;

import java.util.Arrays;
import java.util.Scanner;

public class ShootingAtTheSquareApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] square = new String[5][5];
        for (String[] strings : square) {
            Arrays.fill(strings, "- | ");
        }
        int targetline = (int) (Math.random() * 5);
        int targetbar = (int) (Math.random() * 5);
        System.out.println(targetline);
        System.out.println(targetbar);
        int gamerLine;
        int gamerBar;
        System.out.println("All set. Get ready to rumble!");
        while (true) {
            System.out.println("Enter a shooting line");
            String gamerInputLine = scanner.next();
            if (inputValidation(gamerInputLine)) {
                System.out.println("Enter a shooting bar");
                String gamerInputBar = scanner.next();
                if (inputValidation(gamerInputBar)) {
                    gamerLine = Integer.parseInt(gamerInputLine);
                    gamerBar = Integer.parseInt(gamerInputBar);
                    if (targetline == gamerLine - 1 && targetbar == gamerBar - 1) {
                        square[gamerLine - 1][gamerBar - 1] = "x | ";
                        shouldConsole(square);
                        System.out.println("You have won!");
                        break;
                    } else {
                        square[gamerLine - 1][gamerBar - 1] = "* | ";
                        shouldConsole(square);
                    }
                }
            }
        }
    }

    private static void shouldConsole(String[][] square) {
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " | ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + " | ");
            for (int j = 0; j < 5; j++) {
                System.out.print(square[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean inputValidation(String input) {
        try {
            int n = Integer.parseInt(input);
            if (n > 0 && n < 6) {
                return true;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return false;
    }
}
