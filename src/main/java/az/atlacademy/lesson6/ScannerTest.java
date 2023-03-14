package az.atlacademy.lesson6;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        a = a.trim();
        System.out.println(a);
        System.out.println(a.length());
        System.out.println("first letter" + a.charAt(0));
        System.out.println("last letter" + a.charAt(a.length() - 1));
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.getBytes()[i] + " byte-nin asci qarsiligi -" + (char) a.getBytes()[i]);
        }
    }
}
