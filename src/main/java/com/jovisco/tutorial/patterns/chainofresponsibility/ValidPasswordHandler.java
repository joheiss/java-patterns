package com.jovisco.tutorial.patterns.chainofresponsibility;

public class ValidPasswordHandler extends Handler {

    private final Database database;

    public ValidPasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(Request request) {
        System.out.println("Handle Password Validation");
        if (!database.isValidPassword(request.username(), request.password())) {
            System.out.println("Invalid password");
            return false;
        }
        return handleNext(request);
    }
}
