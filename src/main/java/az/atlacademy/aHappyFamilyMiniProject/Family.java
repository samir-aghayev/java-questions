package az.atlacademy.aHappyFamilyMiniProject;

import java.util.Arrays;

public class Family {
    private final Human mother;
    private final Human father;
    private Human[] children;
    private Pet pet;
    private int familyCounter;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        children = new Human[0];
        familyCounter = 2;
    }

    public void greetPet() {
        System.out.println("Hello, " + pet);
    }

    public void addChild(Human child) {
        familyCounter++;
        Human[] temp = new Human[familyCounter - 2];
        for (int i = 0; i < children.length; i++) {
            temp[i] = children[i];
        }
        temp[temp.length - 1] = child;
        children = temp;
    }

    public boolean deleteChild(Human child) {
        int index = -1;
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(child)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            familyCounter--;
            Human[] temp = new Human[familyCounter - 2];
            int count = 0;
            for (int i = 0; i < temp.length; i++) {
                if (index != i) {
                    temp[count] = children[i];
                    count++;
                }
            }
            children = temp;
            return true;
        } else {
            return false;
        }
    }

    public void describePet() {
        System.out.println("I have a" + pet.getSpecies() + ", he is " + pet.getAge() +
                " years old, he is" + ((pet.getTrickLevel() > 50) ? "very sly" : "almost not sly"));
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human[] getChildren() {
        return children;
    }

    public int getFamilyCounter() {
        return familyCounter;
    }

    public void setFamilyCounter(int familyCounter) {
        this.familyCounter = familyCounter;
    }

    @Override
    public String toString() {
        return "Family{mother=%s, father=%s, children=%s, pet=%s}".formatted(mother, father, Arrays.toString(children), pet);
    }
}
