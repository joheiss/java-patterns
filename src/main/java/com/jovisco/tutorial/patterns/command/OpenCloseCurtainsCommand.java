package com.jovisco.tutorial.patterns.command;

public record OpenCloseCurtainsCommand(Curtains curtains) implements Command {
    @Override
    public void execute() {
        curtains.openClose();
        System.out.println("Curtains " + (curtains.isOpen() ? "opened" : "closed"));
    }
}
