package com.jovisco.tutorial.openclosedprinciple;

public class OpenClosedPrincipleExample {

    public static void main(String[] args) {

        // The Open Closed Principle states that you should not change an existing class
        // if you need to add new functionality to it.

        // Here, the AreaCalculator class is open for extension but closed for modification.
        // This is, because the calculateArea method delegates the calculation to the Shape
        // that is provided as an input parameter and implemented in the respective class.

        AreaCalculator areaCalculator = new AreaCalculator();

        Circle circle = new Circle(5);
        System.out.println(areaCalculator.calculateArea(circle));

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(areaCalculator.calculateArea(rectangle));
    }
}
