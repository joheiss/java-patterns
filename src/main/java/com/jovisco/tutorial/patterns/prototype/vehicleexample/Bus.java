package com.jovisco.tutorial.patterns.prototype.vehicleexample;

public class Bus extends Vehicle {

    private final int numOfSeats;

    public Bus(String brand, String model, String color, int numOfSeats) {
        super(brand, model, color);
        this.numOfSeats = numOfSeats;
    }

    protected Bus(Bus bus) {
        super(bus);
        this.numOfSeats = bus.numOfSeats;
    }

    @Override
    public Bus clone() {
        return new Bus(this);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                "numOfSeats=" + numOfSeats +
                '}';
    }
}
