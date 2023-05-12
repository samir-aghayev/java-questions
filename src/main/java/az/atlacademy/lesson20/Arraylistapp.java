package az.atlacademy.lesson20;

import java.util.ArrayList;

public class Arraylistapp {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add((int) (Math.random() * 100));
        }
        System.out.println(nums);

        nums.sort(Integer::compareTo);
        System.out.println(nums);

        nums.add(nums.size(), 15);
        System.out.println(nums);

        System.out.println(nums.contains(15));
        System.out.println(nums.get(0));
        System.out.println(nums.isEmpty());
        nums.clear();
        System.out.println(nums);
    }
}
