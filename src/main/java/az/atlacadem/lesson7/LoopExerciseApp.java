package az.atlacadem.lesson7;

import java.util.Scanner;

public class LoopExerciseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum=0;
        for (int i = 0; i <4; i++) {
            sum+=(num%10);
            num/=10;
        }
        System.out.println(sum);
    }
}
