package com.jovisco.tutorial.patterns.abstractfactory.shapesexample;

public class ColorFactory extends AbstractFactory{
    @Override
    public Shape createShape(String shape) {
        throw new UnsupportedOperationException("Shape factory doesn't support shapes");
    }

    @Override
    public Color createColor(String color) {
        color = color.toLowerCase();
        return switch(color) {
            case "blue" -> new Blue();
            case "green" -> new Green();
            case "red" -> new Red();
            default -> throw new IllegalArgumentException("Invalid color");
        };
    }
}
