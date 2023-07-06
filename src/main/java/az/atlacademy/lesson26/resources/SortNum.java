package az.atlacademy.lesson26.resources;

import java.util.Arrays;

public class SortNum {
    public static void main(String[] args) {
        int[] nums = {-4, 6, 11, 7, 14, 8, 2, 5, 1, 3, 0};
        int posNum = firsMissPosNum(nums);
        System.out.println(posNum);
    }

    private static int firsMissPosNum(int[] arr) {
        Arrays.sort(arr);
        int minPosNum = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == minPosNum) {
                minPosNum++;
            }
        }
        return minPosNum;
    }
}