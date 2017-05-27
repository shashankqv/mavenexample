package com.shashankv.patterns.singleton;

/**
 * Created by shashank on 27/5/17.
 */

public class Singleton {

    private Singleton() {
        System.out.println("Creating new instance !!");
    }

    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    public void printSingleton() {
        System.out.println("Inside print singleton !!");
    }

    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

}
