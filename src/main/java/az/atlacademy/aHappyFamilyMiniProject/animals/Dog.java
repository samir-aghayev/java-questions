package az.atlacademy.aHappyFamilyMiniProject.animals;

import az.atlacademy.aHappyFamilyMiniProject.enums.Species;

public class Dog extends Pet implements Foul{
    @Override
    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am "+ Species.DOG + "I miss you!");
    }
}
