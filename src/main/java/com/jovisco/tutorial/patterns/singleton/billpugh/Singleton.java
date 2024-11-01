package com.jovisco.tutorial.patterns.singleton.billpugh;

public class Singleton {

    // this nested class is only initialized when it is referenced in the getInstance method,
    // and only then the Singleton is created.
    private static class SingletonHelper {
        private static final Singleton instance = new Singleton();
    }

    private Object data = new Object();

    private Singleton() {}

    public static Singleton getInstance() {
        // get the instance from the nested class
        return SingletonHelper.instance;
    }

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}
