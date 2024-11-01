package com.jovisco.tutorial.patterns.factorymethods.abstractcreator;

import com.jovisco.tutorial.patterns.factorymethods.Shape;

public class AbstractCreatorExample {

    public static void main(String[] args) {

        // create a rectangle using the factory method
        Shape circle = new CircleFactory().getShape();
        circle.draw();

        // create a square using the factory method
        Shape square = new SquareFactory().getShape();
        square.draw();

        // create a rectangle using the abstract creator
        Shape rectangle = new RectangleFactory().getShape();
        rectangle.draw();
    }
}
