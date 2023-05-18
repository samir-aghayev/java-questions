package az.atlacademy.lesson23;

public class RandomNubmbersApp {
    public static void main(String[] args) {
        int[] nums = new int[20];
         int max = nums[0];
        int min = nums[0];
        int sum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
            sum += nums[i];
        }
        double average = sum / 20.0;
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
        System.out.println("Numbers average: " + average);
    }

}
