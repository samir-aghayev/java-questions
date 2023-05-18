package az.atlacademy.lesson23;

import java.util.Collection;
import java.util.function.Consumer;

public class FunctionalProgrammingExamplesApp {
    public static void main(String[] args) {
        Consumer<Collection<Person>> listPerson = new Consumer<Collection<Person>>() {
            @Override
            public void accept(Collection<Person> people) {
                Object[] array = people.toArray();
                for (int i = 0; i < people.size(); i++) {
                    System.out.println(array[i]);
                }
            }
        };
        Consumer<Collection<Person>> listPerson2 = people -> {
            Object[] array = people.toArray();
            for (int i = 0; i < people.size(); i++) {
                System.out.println(array[i]);
            }
        };
    }
}
