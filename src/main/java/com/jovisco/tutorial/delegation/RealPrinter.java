package com.jovisco.tutorial.delegation;

public class RealPrinter implements Printer {

    @Override
    public void print(String message) {
        var formattedMessage = String.format("*** Real Printer ***%n %s %n*** Real Printer ***", message);
        System.out.println(formattedMessage);
    }
}
