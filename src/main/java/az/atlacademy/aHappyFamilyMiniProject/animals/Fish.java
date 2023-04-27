package az.atlacademy.aHappyFamilyMiniProject.animals;

import az.atlacademy.aHappyFamilyMiniProject.enums.Species;

public class Fish extends Pet{
    @Override
    public void respond() {
        System.out.println("Hello, owner. I am "+ Species.FISH + "I miss you!");
    }
}
