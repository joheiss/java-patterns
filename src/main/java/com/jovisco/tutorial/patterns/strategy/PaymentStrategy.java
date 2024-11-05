package com.jovisco.tutorial.patterns.strategy;

public interface PaymentStrategy {

    void collectPaymentDetails();

    boolean validatePaymentDetails();

    void pay(int amount);
}
