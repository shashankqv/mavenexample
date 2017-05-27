package com.shashankv.patterns.singleton.prototype;

import java.util.Hashtable;

/**
 * Created by shashank on 27/5/17.
 */
public class ColorCache {

    private static Hashtable<String, Color> colorMap = new Hashtable<String, Color>();

    public static Color getColor(String colorId) {
        Color cachedColor = colorMap.get(colorId);
        return (Color) cachedColor.clone();
    }

    public static void loadCache() {
        Blue blue = new Blue();
        blue.setId("1");
        colorMap.put(blue.getId(), blue);

        White white = new White();
        white.setId("2");
        colorMap.put(white.getId(), white);
    }
}