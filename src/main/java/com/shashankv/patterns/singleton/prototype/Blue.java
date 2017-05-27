package com.shashankv.patterns.singleton.prototype;

import java.util.Collections;

/**
 * Created by shashank on 27/5/17.
 */
public class Blue extends Color {

    public Blue() {
        type = "Blue";
    }

    @Override
    public void paint(){
        System.out.println("Inside Blue::paint() method");
    }


}
