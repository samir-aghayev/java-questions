package az.atlacademy.eolymp.homeworkConditionsLoops;

import java.util.Scanner;

public class ArrayApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("Max index: " + maxIndex + ", max value: " + max);
        System.out.println("Min index: " + minIndex + ", min value: " + min);
    }
}
