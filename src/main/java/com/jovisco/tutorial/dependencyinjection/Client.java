package com.jovisco.tutorial.dependencyinjection;

public class Client {

    private final Service service;

    public Client(Service service) {
        this.service = service;
    }

    public void runService() {
        service.execute();
    }
}
