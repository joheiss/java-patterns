package com.jovisco.tutorial.patterns.chainofresponsibility;

public class UserExistsHandler extends Handler {

    private final Database database;

    public UserExistsHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(Request request) {
        System.out.println("Handle User Validation");
        if (!database.isValidUser(request.username())) {
            System.out.println("User does not exist");
            return false;
        }
        return handleNext(request);
    }
}
