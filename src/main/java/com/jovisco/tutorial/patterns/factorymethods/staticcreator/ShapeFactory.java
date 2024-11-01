package com.jovisco.tutorial.patterns.factorymethods.staticcreator;

import com.jovisco.tutorial.patterns.factorymethods.Circle;
import com.jovisco.tutorial.patterns.factorymethods.Rectangle;
import com.jovisco.tutorial.patterns.factorymethods.Shape;
import com.jovisco.tutorial.patterns.factorymethods.Square;

public class ShapeFactory {

    public static Shape getShape(String shapeType) {
        shapeType = shapeType.toLowerCase();
        return switch(shapeType) {
            case "square" -> new Square();
            case "circle" -> new Circle();
            case "rectangle" -> new Rectangle();
            default -> null;
        };
    }
}
