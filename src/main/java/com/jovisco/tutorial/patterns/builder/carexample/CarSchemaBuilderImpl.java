package com.jovisco.tutorial.patterns.builder.carexample;

public class CarSchemaBuilderImpl implements CarBuilder {

    private int id;
    private int height;
    private String brand;
    private String model;
    private String color;
    private String engine;
    private int nbrOfDoors;

    @Override
    public CarSchemaBuilderImpl id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public CarSchemaBuilderImpl brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarSchemaBuilderImpl model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarSchemaBuilderImpl color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarSchemaBuilderImpl height(int height) {
        this.height = height;
        return this;
    }

    @Override
    public CarSchemaBuilderImpl engine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarSchemaBuilderImpl nbrOfDoors(int nbrOfDoors) {
        this.nbrOfDoors = nbrOfDoors;
        return this;
    }

    public CarSchema build() {
        return new CarSchema(id, brand, model, color, height, engine, nbrOfDoors);
    }
}
