package az.atlacademy.lesson172;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConcumerApp {
    public static void main(String[] args) {
        Consumer<Collection<Person>> person = new Consumer<Collection<Person>>() {
            @Override
            public void accept(Collection<Person> people) {
                people.forEach(System.out::println);
            }
        };

        Consumer<Collection<Person>> person2 = System.out::println;


        Predicate<Person> predicate = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getName().length() > 5;
            }
        };
        Predicate<Person> predicate2 = person16 -> person16.getName().length() > 5;
        BiPredicate<Person, Person> biPredicate = (person16, person18) -> person16.getName().length() > person18.getName().length();

        List<Person> person4 = new ArrayList<>();
        person4.add(new Person(15, "Samir"));
        person4.add(new Person(16, "Sdaiq"));
        person4.add(new Person(17, "Kamal"));
        person4.add(new Person(18, "Hasan"));
        person4.add(new Person(19, "Elshad"));
        person4.add(new Person(20, "Elmir"));
        person2.accept(person4);

    }
}
