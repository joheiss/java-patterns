package com.jovisco.tutorial.patterns.prototype.vehicleexample;

import java.util.ArrayList;
import java.util.List;

public class VehicleExampleClient {

    public static void main(String[] args) {
        var vehicles = List.of(
                new Car("car_brand", "car_model", "car_color", 300),
                new Bus("bus_brand", "bus_model", "bus_color", 50)
        );

        var copyList = new ArrayList<Vehicle>();
        for (Vehicle vehicle : vehicles) {
            copyList.add(vehicle.clone());
        }

        copyList.forEach(System.out::println);

        System.out.println("==========================================");

        VehicleRegistry registry = new VehicleRegistry();
        registry.put(vehicles);
        System.out.println(registry.get("car_brand car_model"));

    }
}
