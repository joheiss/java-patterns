package com.jovisco.tutorial.patterns.command;

public record SwitchLightsCommand(Light light) implements Command {
    @Override
    public void execute() {
        light.switchLights();
    }
}
