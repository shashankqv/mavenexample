package com.shashankv.core;

/**
 * Created by shashank on 13/5/17.
 */
public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Spring 3 Hello !! " + name);
    }
}