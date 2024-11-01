package com.jovisco.tutorial.patterns.abstractfactory.partsexample;

public class MsiManufacturer extends AbstractPartsFactory{
    @Override
    Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    Monitor createMonitor() {
        return new MsiMonitor();
    }
}
