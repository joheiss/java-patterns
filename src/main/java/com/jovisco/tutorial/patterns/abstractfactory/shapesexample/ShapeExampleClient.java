package com.jovisco.tutorial.patterns.abstractfactory.shapesexample;

import java.util.stream.Stream;

public class ShapeExampleClient {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        var shapes = Stream.of("square", "circle", "rectangle");
        shapes.map(shapeFactory::createShape).forEach(Shape::draw);

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        var colors = Stream.of("red", "green", "blue");
        colors.map(colorFactory::createColor).forEach(Color::fill);

    }
}
