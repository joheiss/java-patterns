package com.jovisco.tutorial.patterns.abstractfactory.shapesexample;

public abstract class AbstractFactory {

    public abstract Shape createShape(String shape);
    public abstract Color createColor(String color);
}
