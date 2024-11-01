package com.jovisco.tutorial.patterns.factorymethods.assignment;

public class AnimalFactory {

    public Animal getAnimal(String animalType) {
        animalType = animalType.toLowerCase();
        return switch(animalType) {
            case "duck" -> new Duck();
            case "tiger" -> new Tiger();
            default -> throw new IllegalArgumentException("Invalid animal type: " + animalType);
        };
    }

}
