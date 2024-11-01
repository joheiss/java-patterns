package com.jovisco.tutorial.patterns.factorymethods.abstractcreator;

import com.jovisco.tutorial.patterns.factorymethods.Circle;
import com.jovisco.tutorial.patterns.factorymethods.Shape;

public class CircleFactory extends AbstractShapeFactory {
    @Override
    protected Shape createShape() {
        return new Circle();
    }
}
