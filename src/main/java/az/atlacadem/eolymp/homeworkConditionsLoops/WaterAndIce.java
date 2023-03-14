package az.atlacadem.eolymp.homeworkConditionsLoops;

import java.util.Scanner;

public class WaterAndIce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        System.out.println((t > 0) ? "Water" : "Ice");
    }
}
