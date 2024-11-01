package com.jovisco.tutorial.patterns.singleton.eager;

public class Singleton {

    // eager initialization at class loading
    private static Singleton instance = new Singleton();

    private Object data = new Object();

    private Singleton() {}

    public static Singleton getInstance() {
        // instance was created at class loading, so it's already initialized
        return instance;
    }

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}
