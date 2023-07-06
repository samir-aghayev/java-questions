package az.atlacademy.lesson29;

import java.util.Scanner;

public class UsernameValidator {
    public static final String regularExpression = "[a-zA-Z][\\w]{7,29}";
}


class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String userName = scan.next();
        if (userName.matches(UsernameValidator.regularExpression)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }


//        int n = Integer.parseInt(scan.nextLine());
//        while (n-- != 0) {
//            String userName = scan.nextLine();
//
//            if (userName.matches(UsernameValidator.regularExpression)) {
//                System.out.println("Valid");
//            } else {
//                System.out.println("Invalid");
//            }
//        }
    }
}
