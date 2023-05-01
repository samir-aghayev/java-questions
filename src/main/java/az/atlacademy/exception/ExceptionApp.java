package az.atlacademy.exception;

import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.next();
            try {
                int inputNum = Integer.parseInt(input);
                System.out.println(inputNum * 5);
                break;
            } catch (NumberFormatException e) {
                System.err.println("Exception, Please try again");
            }
        }
    }
}
