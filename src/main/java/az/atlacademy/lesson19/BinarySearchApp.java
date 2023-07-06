package az.atlacademy.lesson19;

import java.util.Arrays;

public class BinarySearchApp {
    public static void main(String[] args) {
        int[] a = {5, 8, 11, 13, 1, 16, 19, 18, 0};
        int num = -5;
        System.out.println(binarySearch(num, a));
        System.out.println(Arrays.binarySearch(a, num));
        System.out.println(Arrays.toString(a));
        buubleSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static int binarySearch(int num, int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int index = (low + high) / 2;
            if (num == arr[index]) {
                return index;
            } else if (num < arr[index]) {
                high = index - 1;
            } else {
                low = index + 1;
            }
        }
        return -(low + 1);
    }

    public static void buubleSort(int[] a) {
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}
