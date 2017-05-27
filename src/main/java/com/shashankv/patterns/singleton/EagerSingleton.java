package com.shashankv.patterns.singleton;

public class EagerSingleton {

    private static volatile EagerSingleton instance = null;


    // constructor
    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {

        if (instance == null) {
            synchronized (EagerSingleton.class) {
                if (instance == null) {
                    instance = new EagerSingleton();
                }
            }
        }
        return instance;
    }

}