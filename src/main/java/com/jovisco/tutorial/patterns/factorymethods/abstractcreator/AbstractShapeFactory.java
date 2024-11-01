package com.jovisco.tutorial.patterns.factorymethods.abstractcreator;

import com.jovisco.tutorial.patterns.factorymethods.Shape;

public abstract class AbstractShapeFactory {

    protected abstract Shape createShape();

    public Shape getShape() {
        return createShape();
    }
}
