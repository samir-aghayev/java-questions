package az.atlacademy.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.next();
        int inputNum=0;
        try{
            inputNum=Integer.parseInt(input);
        }catch (NumberFormatException numberFormatException){
            System.err.println("Xeta bas verdi");
        }

        int reverse=0;
        while (inputNum>0){
            reverse=reverse*10+inputNum%10;
            inputNum/=10;
        }
        System.out.println(reverse);
    }
}
