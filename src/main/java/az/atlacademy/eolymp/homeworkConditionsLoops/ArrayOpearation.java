package az.atlacademy.eolymp.homeworkConditionsLoops;

import java.util.Scanner;

public class ArrayOpearation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        int max = array[0];
        int maxIndex = 0;
        int min = array[0];
        int minIndex = 0;
        int sum = 0;
        int prod = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            sum += array[i];
            prod *= array[i];
        }
        System.out.println("Max index: " + maxIndex + ", max value: " + max);
        System.out.println("Min index: " + minIndex + ", min value: " + min);
        System.out.println("Sum of digit: " + sum);
        System.out.println("Prod of digit: " + prod);
        System.out.println("Avarage of digit: " + (sum/ array.length));
    }
}
