package az.atlacademy.aHappyFamilyMiniProject;

import az.atlacademy.aHappyFamilyMiniProject.enums.DayOfWeek;

import java.util.Objects;

public class Human {
    Family family;
    private String name;
    private String surname;
    private int year;
    private int iq; //1-100
    private DayOfWeek schedule;

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }


    public Human(String name, String surname, int year, int iq, DayOfWeek schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Human{" +
                "family=" + family +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + schedule +
                ((schedule!=null)?
                ", scheduleTask=" + schedule.getTask():"") +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public int getIq() {
        return iq;
    }


    public DayOfWeek getSchedule() {
        return schedule;
    }

    public Family getFamily() {
        return family;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return getYear() == human.getYear() && getIq() == human.getIq() && Objects.equals(getFamily(), human.getFamily()) && Objects.equals(getName(), human.getName()) && Objects.equals(getSurname(), human.getSurname()) && getSchedule() == human.getSchedule();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFamily(), getName(), getSurname(), getYear(), getIq(), getSchedule());
    }
}
