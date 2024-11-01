package com.jovisco.tutorial.patterns.abstractfactory.partsexample;

public class AsusMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("Assembling ASUS monitor ...");
    }
}
