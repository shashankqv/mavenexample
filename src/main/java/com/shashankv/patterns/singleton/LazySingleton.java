package com.shashankv.patterns.singleton;

/**
 * Created by shashank on 27/5/17.
 */
public class LazySingleton {

    private static volatile LazySingleton instance = null;


    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                instance = new LazySingleton();
            }
        }
        return instance;
    }

}
