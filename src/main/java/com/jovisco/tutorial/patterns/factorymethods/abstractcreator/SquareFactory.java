package com.jovisco.tutorial.patterns.factorymethods.abstractcreator;

import com.jovisco.tutorial.patterns.factorymethods.Shape;
import com.jovisco.tutorial.patterns.factorymethods.Square;

public class SquareFactory extends AbstractShapeFactory {
    @Override
    protected Shape createShape() {
        return new Square();
    }
}
