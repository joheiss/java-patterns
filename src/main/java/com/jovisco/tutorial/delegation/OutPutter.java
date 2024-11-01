package com.jovisco.tutorial.delegation;

public class OutPutter {

    private final Printer printer;

    public OutPutter(Printer printer) {
        this.printer = printer;
    }

    public void print(String message) {
        printer.print(message); // delegation
    }
}
