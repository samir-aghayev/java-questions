package az.atlacademy.lesson28;

import java.io.Serializable;

public class Person  implements Serializable {
    public static final long serialVersionUID = 18;

    public final long id;
    public final String name;
    public final String surname;
    public transient double salary;

    public Person(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("Person{id=%d, name='%s'}", id, name);
    }
}
