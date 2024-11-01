package com.jovisco.tutorial.delegation;

public class DelegationExample {

    public static void main(String[] args) {

        // the outputter is delegating the print to the real printer
        var outPutter = new OutPutter(new RealPrinter());
        outPutter.print("Hello World!");
    }
}
