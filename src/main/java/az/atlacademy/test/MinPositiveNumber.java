package az.atlacademy.test;

import java.util.Arrays;

public class MinPositiveNumber {
    public static void main(String[] args) {
        int[] nums = {-4, 0, 1, 2, 3, 5, 6, 7, 8, 11, 14};
        int posNum = firsMissPosNum1(nums);
        int posNum2 = firsMissPosNum2(nums);
        System.out.println(posNum);
        System.out.println(posNum2);
    }

    private static int firsMissPosNum1(int[] arr) {
        Arrays.sort(arr);
        int minPosNum = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] != minPosNum) {
                    return minPosNum;
                }
                minPosNum++;
            }
        }
        return (arr[arr.length - 1]++);
    }

    private static int firsMissPosNum2(int[] arr) {
        Arrays.sort(arr);
        int minPosNum = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] != minPosNum) {
                return minPosNum;
            } else if (arr[i] > 0) {
                minPosNum++;
            }
        }
        return (arr[arr.length - 1]++);
    }

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    







}