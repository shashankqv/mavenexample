package com.shashankv.patterns.singleton.prototype;

/**
 * Created by shashank on 27/5/17.
 */
public class PrototypeDriver {
    public static void main(String args[]) {
        ColorCache.loadCache();

        Color clonedColor = ColorCache.getColor("1");
        System.out.println("Color : " + clonedColor.getType());

        Color clonedColor2 = ColorCache.getColor("2");
        System.out.println("Color : " + clonedColor2.getType());

    }
}
