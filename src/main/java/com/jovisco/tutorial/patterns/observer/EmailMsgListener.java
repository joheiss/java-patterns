package com.jovisco.tutorial.patterns.observer;

public record EmailMsgListener(String email) implements Listener {

    @Override
    public void update(Event eventType) {
        System.out.println("Sending email to " + email);
    }
}
