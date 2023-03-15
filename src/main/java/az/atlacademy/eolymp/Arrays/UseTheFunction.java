package az.atlacademy.eolymp.Arrays;

import java.util.Scanner;

public class UseTheFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        double max = min(max(x,y),max(y,z),x+y+z);
        System.out.printf("%.2f", max);
    }

    public static double min(double x, double y) {
        return (x < y) ? x : y;
    }

    public static double min(double x, double y, double z) {
        return (min(min(x, y), z));
    }

    public static double max(double x, double y) {
        return (x > y) ? x : y;
    }
}
