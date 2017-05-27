package com.shashankv.patterns.singleton;

/**
 * Created by shashank on 27/5/17.
 */
public class SingletonDispenser {
    private static ThreadLocalSingleton conn = new ThreadLocalSingleton();

    public static Singleton getThreadLocalSingleton() {
        return (Singleton) conn.get();
    }

    private static class ThreadLocalSingleton extends ThreadLocal {
        public Object initialValue() {
            return Singleton.getInstance();
        }

    }
}
