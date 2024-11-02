package com.jovisco.tutorial.patterns.prototype.vehicleexample;

public class Car extends Vehicle{

    private final int topSpeed;

    public Car(String brand, String model, String color, int topSpeed) {
        super(brand, model, color);
        this.topSpeed = topSpeed;
    }

    protected Car(Car car) {
        super(car);
        this.topSpeed = car.topSpeed;
    }

    @Override
    public Car clone() {
        return new Car(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                "topSpeed=" + topSpeed +
                '}';
    }
}
