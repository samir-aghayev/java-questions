package az.atlacademy.lesson23;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExampleApp {
    public static void main(String[] args) {
        Person person1 = new Person(15, "Ali");
        Person person2 = new Person(17, "Musa");

        Predicate<Person> greatName = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return (person.getName().length() > 5);
            }
        };

        Predicate<Person> greatNameWithLambdar = person -> person.getName().length() > 5;


        BiPredicate<Person, Person> compareName = new BiPredicate<Person, Person>() {
            @Override
            public boolean test(Person person1, Person person2) {
                return person1.getName().length() > person2.getName().length();
            }
        };

        BiPredicate<Person, Person> compareNameWithLambda = (person3, person4) -> person3.getName().length() > person4.getName().length();

        System.out.println(greatName.test(person1));
        System.out.println(greatNameWithLambdar.test(person2));
        System.out.println(compareName.test(person1, person2));
        System.out.println(compareNameWithLambda.test(person1, person2));
    }
}
