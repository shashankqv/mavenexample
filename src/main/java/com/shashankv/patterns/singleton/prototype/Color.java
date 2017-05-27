package com.shashankv.patterns.singleton.prototype;

/**
 * Created by shashank on 27/5/17.
 */
public abstract class Color implements Cloneable {
    String id;
    String type;

    abstract void paint();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object clone(){
        Object clone = null;

        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;

    }
}
