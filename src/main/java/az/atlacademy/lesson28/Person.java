package az.atlacademy.lesson28;

import java.io.Serializable;

public class Person implements Serializable {
    public static final long serialVersionUID = 18;

    public final String name;
    public final String surname;
    public transient double salary;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{name='%s', surname='%s', salary=%s}".formatted(name, surname, salary);
    }
}