package com.jovisco.tutorial.patterns.strategy;

public class StrategyClient {

    public static void main(String[] args) {

        var paymentService = new PaymentService();

        // strategy can be picked at runtime
        paymentService.setStrategy(new PaymentByPayPal());
        paymentService.processOrder(100);

        paymentService.setStrategy(new PaymentByCreditCard());
        paymentService.processOrder(100);
    }
}
