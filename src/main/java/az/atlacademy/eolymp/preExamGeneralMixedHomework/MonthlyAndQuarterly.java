package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class MonthlyAndQuarterly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        if(n<4){
            System.out.println("First");
        }else if(n<7){
            System.out.println("Second");
        }else if(n<10){
            System.out.println("Third");
        }else{
            System.out.println("Fourth");
        }
    }
}
