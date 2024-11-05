package com.jovisco.tutorial.patterns.observer;

public record MobileAppListener(String username) implements Listener {

    @Override
    public void update(Event eventType) {
        System.out.println("Sending push notification to " + username);
    }
}
