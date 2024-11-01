package com.jovisco.tutorial.dependencyinjection;

public class ServiceImplB implements Service {

    @Override
    public void execute() {
        System.out.println("Executing the service B ...");
    }
}
