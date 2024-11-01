package com.jovisco.tutorial.patterns.singleton.lazy;

public class Singleton {

    private static Singleton instance = null;

    private Object data = new Object();

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}
