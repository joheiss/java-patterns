package com.jovisco.tutorial.patterns.builder.vehicleexample;

public interface VehicleBuilder {
    void buildBody();
    void insertWheels();
    void addHeadlights();
    Vehicle getVehicle();
}
