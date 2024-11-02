package com.jovisco.tutorial.patterns.builder.vehicleexample;

public class MotorcycleBuilder implements VehicleBuilder {

    private final Vehicle bike = new Motorcycle();

    @Override
    public void buildBody() {
        bike.add(("1 motorcycle body"));
    }

    @Override
    public void insertWheels() {
        bike.add("2 motorcycle wheels");
    }

    @Override
    public void addHeadlights() {
        bike.add("1 motorcycle headlight");
    }

    @Override
    public Vehicle getVehicle() {
        return bike;
    }
}
