package com.jovisco.tutorial.patterns.chainofresponsibility;

public class ChainOfRespClient {

    public static void main(String[] args) {

        Database database = Database.getInstance();

        // prepare chain of responsibility
        Handler handler = new UserExistsHandler(database);
        handler.setNext(new ValidPasswordHandler(database))
                .setNext(new RoleCheckHandler(database));

        // run chain of responsibility
        var request = new Request("admin_username", "admin_password1", "login");
        var success = handler.handle(request);
        if (success) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }
}
