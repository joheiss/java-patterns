package com.jovisco.tutorial.patterns.singleton.assignment;

public class TeamCaptainClient {

    public static void main(String[] args) {
        TeamCaptainSingleton captain = TeamCaptainSingleton.getInstance();
        captain.setName("Bill Pugh");
        System.out.println(captain.getName());

        // try that again and see if we get the same team captain
        var captain2 = TeamCaptainSingleton.getInstance();
        System.out.println(captain2.getName());
        assert captain == captain2;
    }
}
