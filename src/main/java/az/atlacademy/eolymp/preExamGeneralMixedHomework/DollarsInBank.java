package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class DollarsInBank {
        public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long s= scanner.nextLong();
        long n=0;
        long sum=0;
        long lastYear=0;
        while (sum<s){
            n++;
            lastYear=lastYear*2+n;
            sum+=lastYear;
        }
        System.out.println((n));
    }
}
