package az.atlacademy.lesson18.exp1;

import java.util.Comparator;

public class DefaultComparatorPerson implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (!o1.name.equals(o2.name)) {
            return o1.name.compareTo(o2.name);
        } else if (o1.age != o2.age) {
            return Integer.compare(o1.age, o2.age);
        }
        return Double.compare(o2.salary, o1.salary);
    }
}
