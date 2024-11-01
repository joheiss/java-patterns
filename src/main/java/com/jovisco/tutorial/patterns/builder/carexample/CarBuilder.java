package com.jovisco.tutorial.patterns.builder.carexample;

public interface CarBuilder {

    CarBuilder id(int id);

    CarBuilder brand(String brand);

    CarBuilder model(String model);

    CarBuilder color(String color);

    CarBuilder height(int height);

    CarBuilder engine(String engine);

    CarBuilder nbrOfDoors(int nbrOfDoors);

}
