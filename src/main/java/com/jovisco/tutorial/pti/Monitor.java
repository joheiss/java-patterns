package com.jovisco.tutorial.pti;

public class Monitor implements Display {
    @Override
    public void display(String message) {
        String formattedMessage = String.format("*** Monitor ***%n %s %n*** Monitor ***", message);
        System.out.println(formattedMessage);
    }
}
