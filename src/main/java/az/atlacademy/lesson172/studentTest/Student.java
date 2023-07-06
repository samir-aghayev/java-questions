package az.atlacademy.lesson172.studentTest;

import java.util.Objects;

public final class Student implements Comparable<Student> {
    public final int id;
    public final double grade;
    public final String name;

    public Student(int id, double grade, String name) {
        this.id = id;
        this.grade = grade;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getId() == student.getId() && Double.compare(student.getGrade(), getGrade()) == 0 && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getGrade(), getName());
    }

    @Override
    public String toString() {
        return "Student{id=%d, grade=%s, name='%s'}".formatted(id, grade, name);
    }

    public int getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student that) {
        return Integer.compare(this.id, that.id);
    }
}
