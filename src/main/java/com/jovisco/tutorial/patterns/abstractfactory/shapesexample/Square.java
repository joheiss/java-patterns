package com.jovisco.tutorial.patterns.abstractfactory.shapesexample;

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square ...");
    }
}
