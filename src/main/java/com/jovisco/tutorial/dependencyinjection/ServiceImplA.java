package com.jovisco.tutorial.dependencyinjection;

public class ServiceImplA implements Service {

    @Override
    public void execute() {
        System.out.println("Executing the service A ...");
    }
}
