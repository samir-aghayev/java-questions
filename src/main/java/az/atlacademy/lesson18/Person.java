package az.atlacademy.lesson18;

public final class Person implements Comparable<Person> {
    public final int id;
    public final String name;
    public final int age;
    public final double salary;

    public Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    @Override
    public int compareTo(Person that) {
        return Integer.compare(this.id, that.id);
    }

    @Override
    public String toString() {
        return "Person{id=%d, name='%s', age=%d, salary=%s}".formatted(id, name, age, salary);
    }
}
