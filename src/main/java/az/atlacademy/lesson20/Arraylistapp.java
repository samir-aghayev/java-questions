package az.atlacademy.lesson20;

import java.util.ArrayList;

public class Arraylistapp {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            num.add((int)(Math.random()*100));
        }
        System.out.println(num);

        num.sort(Integer::compareTo);
        System.out.println(num);

        num.add(num.size()-1, 15);
        System.out.println(num);

        System.out.println(num.contains(15));
        System.out.println(num.get(0));
        System.out.println(num.isEmpty());
        num.clear();
        System.out.println(num);
    }
}
