package com.jovisco.tutorial.patterns.state;

public class StateClient {

    public static void main(String[] args) {

        Phone phone = new Phone();
        simulatePhoneClicks(phone);
    }

    private static void simulatePhoneClicks(Phone phone) {
        System.out.println(phone.clickPower());
        System.out.println(phone.clickPower());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickPower());
        System.out.println(phone.clickPower());
        System.out.println(phone.clickHome());
    }

}
