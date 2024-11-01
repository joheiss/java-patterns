package com.jovisco.tutorial.patterns.abstractfactory.shapesexample;

class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Filling with red color ...");
    }
}
