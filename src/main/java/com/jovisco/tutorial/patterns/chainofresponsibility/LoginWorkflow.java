package com.jovisco.tutorial.patterns.chainofresponsibility;

public class LoginWorkflow {

    private final Database database;
    private final Handler handler;

    public LoginWorkflow(Database database) {
        this.database = database;
        this.handler = new UserExistsHandler(database);
        handler.setNext(new ValidPasswordHandler(database))
                .setNext(new RoleCheckHandler(database));
    }

    public Handler getHandler() { return handler; }
}
