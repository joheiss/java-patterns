package com.jovisco.tutorial.patterns.chainofresponsibility;

public abstract class Handler {

    private Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public abstract boolean handle(Request request);

    protected boolean handleNext(Request request) {
        return (next != null) ? next.handle(request) : true;
    }
}
