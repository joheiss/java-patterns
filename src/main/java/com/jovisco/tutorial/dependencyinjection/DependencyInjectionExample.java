package com.jovisco.tutorial.dependencyinjection;

public class DependencyInjectionExample {

    public static void main(String[] args) {

        // the client gets the service injected in the constructor, and therefore the decision
        //  which underlying service should be used is done on the top level.
        // Thus, client is not dependent on the concrete implementation of the service.
        var client = new Client(new ServiceImplA());
        client.runService();

        client = new Client(new ServiceImplB());
        client.runService();
    }
}
