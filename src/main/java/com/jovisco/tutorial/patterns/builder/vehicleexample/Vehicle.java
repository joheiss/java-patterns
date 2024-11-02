package com.jovisco.tutorial.patterns.builder.vehicleexample;

import java.util.LinkedList;
import java.util.List;

public abstract class Vehicle {

    private final LinkedList<String> parts = new LinkedList<>();

    public void add(String part) {
        parts.addLast(part);
    }

    public List<String> getParts() {
        return parts;
    }

    public void printParts() {
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
