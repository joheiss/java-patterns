package com.jovisco.tutorial.patterns.abstractfactory.partsexample;

public class PartsExampleClient {

    public static void main(String[] args) {

        AbstractPartsFactory factory = new AsusManufacturer();
        factory.createGpu().assemble();
        factory.createMonitor().assemble();

        factory = new MsiManufacturer();
        factory.createGpu().assemble();
        factory.createMonitor().assemble();
    }
}
