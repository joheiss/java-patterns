package com.jovisco.tutorial.patterns.singleton.assignment;

public class TeamCaptainSingleton {

    private static class SingletonHelper {
        private static final TeamCaptainSingleton instance = new TeamCaptainSingleton();
    }

    private String name = "";

    private TeamCaptainSingleton() {
    }

    public static TeamCaptainSingleton getInstance() {
        return SingletonHelper.instance;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
