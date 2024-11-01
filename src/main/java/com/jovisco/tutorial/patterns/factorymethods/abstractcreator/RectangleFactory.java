package com.jovisco.tutorial.patterns.factorymethods.abstractcreator;

import com.jovisco.tutorial.patterns.factorymethods.Rectangle;
import com.jovisco.tutorial.patterns.factorymethods.Shape;

public class RectangleFactory extends AbstractShapeFactory{
    @Override
    protected Shape createShape() {
        return new Rectangle();
    }
}
