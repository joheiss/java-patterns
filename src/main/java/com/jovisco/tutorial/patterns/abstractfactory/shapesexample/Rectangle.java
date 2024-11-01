package com.jovisco.tutorial.patterns.abstractfactory.shapesexample;

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle ...");
    }
}
