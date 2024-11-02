package com.jovisco.tutorial.patterns.chainofresponsibility;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private static class SingletonHelper {
        private static final Database INSTANCE = new Database();
    }
    private final Map<String, String> users;

    private Database() {
        users = new HashMap<>();
        users.put("admin_username", "admin_password1");
        users.put("user_username", "user_password1");
    }

    public static Database getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public boolean isValidUser(String username) {
        return users.containsKey(username);
    }

    public boolean isValidPassword(String username, String password) {
        return users.get(username).equals(password);
    }

}
