package az.atlacademy.lesson27.ObjectWrite;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    private int age;
    private double grade;
    private String name;

    public Student(int age, double grade, String name) {
        this.age = age;
        this.grade = grade;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getAge() == student.getAge() && Double.compare(student.getGrade(), getGrade()) == 0 && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getGrade(), getName());
    }

    @Override
    public String toString() {
        return "Student{age=%d, grade=%s, name='%s'}".formatted(age, grade, name);
    }
}
