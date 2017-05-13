package hello;

import org.joda.time.LocalTime;

/**
 * Created by shashank on 13/5/17.
 */
public class HelloWorld {
    public static void main(String args[]) {
        LocalTime currentTime = new LocalTime();
        System.out.println("Current local time is " + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}