package com.jovisco.tutorial.patterns.singleton.doublecheckedlocking;

public class Singleton {

    private static volatile Singleton instance = null;

    private Object data = new Object();

    private Singleton() {}

    public static Singleton getInstance() {
        var result = instance;
        if (result == null) {
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Singleton();
                }
            }
        }
        return result;
    }

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}
