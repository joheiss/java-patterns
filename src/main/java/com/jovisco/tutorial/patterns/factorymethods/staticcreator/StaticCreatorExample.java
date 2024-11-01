package com.jovisco.tutorial.patterns.factorymethods.staticcreator;

import com.jovisco.tutorial.patterns.factorymethods.Shape;

import java.util.Objects;

public class StaticCreatorExample {

    public static void main(String[] args) {

        // create a circle using the concrete factory method
        Shape circle = ShapeFactory.getShape("circle");
        assert circle != null;
        circle.draw();

        // create a square using the concrete factory method
        Shape square = ShapeFactory.getShape("square");
        assert square != null;
        square.draw();

        // create a rectangle using the concrete factory method
        Shape rectangle = ShapeFactory.getShape("rectangle");
        assert rectangle != null;
        rectangle.draw();
    }
}
