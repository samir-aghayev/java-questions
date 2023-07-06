package az.atlacademy.lesson18.exp1;

import java.util.Arrays;
import java.util.Comparator;

public class PersonApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person(1, "Murad", 18, 800.5),
                new Person(2, "Ilqar", 23, 900.73),
                new Person(3, "Huseyn", 18, 800.5),
                new Person(4, "Resul", 52, 300.64),
                new Person(5, "Ali", 43, 675.48),
        };
        System.out.println(Arrays.toString(people));
        Arrays.sort(people, new DefaultComparatorPerson());
        System.out.println(Arrays.toString(people));
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o2.age, o1.age);
            }
        });
        System.out.println(Arrays.toString(people));
        Arrays.sort(people, Comparator.comparingDouble(person -> person.salary));
        System.out.println(Arrays.toString(people));
    }
}
