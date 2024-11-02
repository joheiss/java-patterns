package com.jovisco.tutorial.patterns.builder.vehicleexample;

public class VehicleExampleClient {

    public static void main(String[] args) {

        VehicleDirector director = new VehicleDirector();

        // construct a car
        System.out.println("*** Constructing a Car ***");
        VehicleBuilder builder = new CarBuilder();
        director.construct(builder);

        // construct a motorcycle
        System.out.println("*** Constructing a Motorcycle ***");
        builder = new MotorcycleBuilder();
        director.construct(builder);
    }
}
