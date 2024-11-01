package com.jovisco.tutorial.patterns.abstractfactory.partsexample;

public class MsiMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("Assembling MSI monitor ...");
    }
}
