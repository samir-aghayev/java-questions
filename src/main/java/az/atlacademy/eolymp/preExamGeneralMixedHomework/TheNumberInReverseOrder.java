package az.atlacademy.eolymp.preExamGeneralMixedHomework;

import java.util.Scanner;

public class TheNumberInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String strr2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            strr2 += str.charAt(i);
        }
        System.out.println(strr2);
    }
}
