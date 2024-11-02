package com.jovisco.tutorial.patterns.builder.vehicleexample;

public class VehicleDirector {

    public void construct(VehicleBuilder builder) {
        builder.buildBody();
        builder.insertWheels();
        builder.addHeadlights();
        builder.getVehicle().printParts();
    }
}
