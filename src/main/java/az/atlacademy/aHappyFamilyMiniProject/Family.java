package az.atlacademy.aHappyFamilyMiniProject;

import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        children=new Human[5];
    }

    public void greetPet() {
        System.out.println("Hello, " + pet);
    }

    public void describePet() {
        System.out.println("I have a" + pet.getSpecies() + ", he is " + pet.getAge() +
                " years old, he is" + ((pet.getTrickLevel() > 50) ? "very sly" : "almost not sly"));
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Family{mother=%s, father=%s, children=%s, pet=%s}".formatted(mother, father, Arrays.toString(children), pet);
    }
}
