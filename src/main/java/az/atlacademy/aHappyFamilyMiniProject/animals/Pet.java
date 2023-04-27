package az.atlacademy.aHappyFamilyMiniProject.animals;

import az.atlacademy.aHappyFamilyMiniProject.enums.Species;

import java.util.Arrays;
import java.util.Objects;

abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;    //1-100
    private String[] habits;

    public Pet() {
    }

    public Pet(String nickname) {
        this.nickname = nickname;
    }

    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public abstract void respond();

    @Override
    public String toString() {
        return "%s{nickname= '%s', age = %d, trickLevel = %d, habits =%s}".formatted(species, nickname, age, trickLevel, Arrays.toString(habits));
    }

    public Species getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public String getNickname() {
        return nickname;
    }

    public String[] getHabits() {
        return habits;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet pet)) return false;
        return getAge() == pet.getAge() && getTrickLevel() == pet.getTrickLevel() && Objects.equals(getSpecies(), pet.getSpecies()) && Objects.equals(getNickname(), pet.getNickname()) && Arrays.equals(getHabits(), pet.getHabits());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getSpecies(), getNickname(), getAge(), getTrickLevel());
        result = 31 * result + Arrays.hashCode(getHabits());
        return result;
    }
}
