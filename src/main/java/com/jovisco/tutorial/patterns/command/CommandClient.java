package com.jovisco.tutorial.patterns.command;

public class CommandClient {

    public static void main(String[] args) {

        // prepare the room
        Room room = new Room();
        room.setCommand(new OpenCloseCurtainsCommand(room.getCurtains()));
        room.executeCommand();
        System.out.println("Curtains are " + (room.curtainsOpen() ? "open" : "closed"));

        // prepare the floor lamp
        FloorLamp floorLamp = new FloorLamp();
        floorLamp.setCommand(new SwitchLightsCommand(floorLamp.getLight()));
        floorLamp.executeCommand();
        System.out.println("Light is " + (floorLamp.isLightOn() ? "on" : "off"));
    }
}