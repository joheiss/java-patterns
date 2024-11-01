package com.jovisco.tutorial.pti;

public class ProgrammingToAnInterfaceExample {

    public static void main(String[] args) {

        var computer = new Computer();
        computer.setDisplayService(new Monitor());
        computer.display("Hello World!");

        computer = new Computer();
        computer.setDisplayService(new Projector());
        computer.display("Hello World!");
    }
}
