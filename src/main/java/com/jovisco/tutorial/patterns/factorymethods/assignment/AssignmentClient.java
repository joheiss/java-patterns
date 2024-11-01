package com.jovisco.tutorial.patterns.factorymethods.assignment;

public class AssignmentClient {

    public static void main(String[] args) {

        try {
            Animal duck = new AnimalFactory().getAnimal("duck");
            duck.walk();
            Animal tiger = new AnimalFactory().getAnimal("tiger");
            tiger.walk();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
