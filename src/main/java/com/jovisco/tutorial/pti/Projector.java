package com.jovisco.tutorial.pti;

public class Projector implements Display {
    @Override
    public void display(String message) {
        String formattedMessage = String.format("*** PROJECTOR ***%n %s %n*** PROJECTOR ***", message);
        System.out.println(formattedMessage);
    }
}
