package com.jovisco.tutorial.patterns.singleton.lazy;

public class LazySingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setData("Hello World!");
        System.out.println(singleton.getData());

        // try that again and see if we get the same singleton
        var singleton2 = Singleton.getInstance();
        System.out.println(singleton2.getData());
        assert singleton == singleton2;
    }
}
