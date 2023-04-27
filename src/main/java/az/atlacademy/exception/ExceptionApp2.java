package az.atlacademy.exception;

import java.util.Scanner;

public class ExceptionApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        String input2 = scanner.next();
        int inputNum1 = 0;
        int inputNum2 = 0;
        try {
            inputNum1 = Integer.parseInt(input1);
            inputNum2 = Integer.parseInt(input2);
        } catch (NumberFormatException numberFormatException) {
            System.err.println("Xeta bas verdi");
        }
        int devided=0;
        try {
            devided=inputNum1/inputNum2;
        }catch (ArithmeticException a){
            System.err.println("0-a bolmek olmaz");
        }
        System.out.println(devided);
    }
}
