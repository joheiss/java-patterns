package com.jovisco.tutorial.patterns.abstractfactory.shapesexample;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape createShape(String shapeType) {
        shapeType = shapeType.toLowerCase();
        return switch(shapeType) {
            case "square" -> new Square();
            case "circle" -> new Circle();
            case "rectangle" -> new Rectangle();
            default -> throw new IllegalArgumentException("Invalid shape type: " + shapeType);
        };
    }

    @Override
    public Color createColor(String color) {
        // greetings from Liskov Substitution Principle
        throw new UnsupportedOperationException("Shape factory doesn't support colors");
    }

}
