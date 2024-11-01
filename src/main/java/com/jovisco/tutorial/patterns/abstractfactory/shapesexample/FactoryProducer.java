package com.jovisco.tutorial.patterns.abstractfactory.shapesexample;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        choice = choice.toLowerCase();
        return switch(choice) {
            case "shape" -> new ShapeFactory();
            case "color" -> new ColorFactory();
            default -> throw new IllegalArgumentException("Invalid choice");
        };
    }

}
