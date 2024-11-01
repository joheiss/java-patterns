package com.jovisco.tutorial.patterns.abstractfactory.partsexample;

public class AsusManufacturer extends AbstractPartsFactory{
    @Override
    Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    Monitor createMonitor() {
        return new AsusMonitor();
    }
}
