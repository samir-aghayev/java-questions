package az.atlacademy.aHappyFamilyMiniProject.animals;

import az.atlacademy.aHappyFamilyMiniProject.enums.Species;

public class RoboCat extends Pet{
    @Override
    public void respond() {
        System.out.println("Hello, owner. I am "+ Species.ROBOCAT + "I miss you!");
    }
}
