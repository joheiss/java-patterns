package com.jovisco.tutorial.patterns.singleton.synchro;

public class Singleton {

    private static volatile Singleton instance = null;

    private Object data = new Object();

    private Singleton() {}

    public static Singleton getInstance() {
        // have thread wait in case it's currently locked by another thread
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
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
