package com.jovisco.tutorial.patterns.command;

public class Light {

    private boolean switchedOn = false;

    public void switchLights() {
        switchedOn = !switchedOn;
        System.out.println("Light switched " + (switchedOn ? "on" : "off"));
    }

    public boolean isSwitchedOn() {
        return switchedOn;
    }
}
