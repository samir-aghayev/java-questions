package az.atlacademy.eolymp.homeworkConditionsLoops;

import java.util.Scanner;

public class TwoDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int n=Math.abs(num/10);
        if(n>0 && n<10){
            System.out.println("Ok");
        }else{
            System.out.println("No");
        }
    }
}
