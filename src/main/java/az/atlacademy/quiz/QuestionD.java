package az.atlacademy.quiz;

import java.util.Scanner;

public class QuestionD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println(max + " " + (maxIndex + 1));
    }
}
