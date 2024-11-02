package com.jovisco.tutorial.patterns.builder.vehicleexample;

public class CarBuilder implements VehicleBuilder {

    private final Vehicle car = new Car();

    @Override
    public void buildBody() {
        car.add(("1 car body"));
    }

    @Override
    public void insertWheels() {
        car.add("4 car wheels");
    }

    @Override
    public void addHeadlights() {
        car.add("2 car headlights");
    }

    @Override
    public Vehicle getVehicle() {
        return car;
    }
}
