package com.jovisco.tutorial.patterns.prototype.vehicleexample;

public abstract class Vehicle implements Cloneable {

    private final String brand;
    private final String model;
    private final String color;

    public Vehicle(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    protected Vehicle(Vehicle vehicle) {
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.color = vehicle.color;
    }

    @Override
    public abstract Vehicle clone();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}
