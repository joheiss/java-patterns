package com.jovisco.tutorial.patterns.factorymethods.concretecreator;

import com.jovisco.tutorial.patterns.factorymethods.Shape;

public class ConcreteCreatorExample {

    public static void main(String[] args) {

        // create a circle using the concrete factory method
        Shape circle = new ShapeFactory().getShape("circle");
        circle.draw();

        // create a square using the concrete factory method
        Shape square = new ShapeFactory().getShape("square");
        square.draw();

        // create a rectangle using the concrete factory method
        Shape rectangle = new ShapeFactory().getShape("rectangle");
        rectangle.draw();
    }
}
