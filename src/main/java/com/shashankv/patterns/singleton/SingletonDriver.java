package com.shashankv.patterns.singleton;

/**
 * Created by shashank on 27/5/17.
 */
public class SingletonDriver {

    public static void main(String args[]){
        Singleton.getInstance().printSingleton();
        Singleton.getInstance().printSingleton();
        Singleton.getInstance().printSingleton();
        Singleton.getInstance().printSingleton();
    }
}
