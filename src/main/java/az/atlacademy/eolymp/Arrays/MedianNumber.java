package az.atlacademy.eolymp.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MedianNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[1]);
    }
}
