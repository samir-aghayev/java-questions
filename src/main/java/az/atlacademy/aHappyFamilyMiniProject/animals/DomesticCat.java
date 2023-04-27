package az.atlacademy.aHappyFamilyMiniProject.animals;

import az.atlacademy.aHappyFamilyMiniProject.enums.Species;

public class DomesticCat extends Pet{
    @Override
    public void respond() {
        System.out.println("Hello, owner. I am "+ Species.DOMESTICCAT + "I miss you!");
    }
}
