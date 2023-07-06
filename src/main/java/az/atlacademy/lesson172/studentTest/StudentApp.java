package az.atlacademy.lesson172.studentTest;

import java.util.Arrays;
import java.util.Comparator;

public class StudentApp {
    public static void main(String[] args) {
        Student[] a = {
                new Student(1, 52, "Samir"),
                new Student(2, 65, "Samir"),
                new Student(3, 65, "Seymur"),
                new Student(4, 23, "Tural"),
                new Student(5, 64, "Ceyhun"),
                new Student(5, 64, "Resad")
        };

        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, new StudentComparator());
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, Comparator.comparingDouble(student -> student.grade));
        System.out.println(Arrays.toString(a));

    }
}
