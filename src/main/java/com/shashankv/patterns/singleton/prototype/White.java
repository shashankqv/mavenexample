package com.shashankv.patterns.singleton.prototype;

/**
 * Created by shashank on 27/5/17.
 */
public class White extends Color {

    public White() {
        type = "White";
    }

    public void paint() {
        System.out.println("Inside White::paint() method");
    }
}
