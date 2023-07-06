package az.atlacademy.lesson16;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 15, 65, 1};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
