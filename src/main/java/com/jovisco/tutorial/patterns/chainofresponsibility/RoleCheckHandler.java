package com.jovisco.tutorial.patterns.chainofresponsibility;

public class RoleCheckHandler extends Handler {

    private final Database database;

    public RoleCheckHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(Request request) {
        System.out.println("Handle Role Check");
        return true && handleNext(request);
    }
}
