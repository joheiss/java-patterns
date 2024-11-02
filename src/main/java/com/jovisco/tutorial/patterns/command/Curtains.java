package com.jovisco.tutorial.patterns.command;

public class Curtains {

    private boolean open = true;

    public void openClose() {
        open = !open;
    }

    public boolean isOpen() {
        return open;
    }
}
