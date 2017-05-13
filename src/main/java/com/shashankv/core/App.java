package com.shashankv.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by shashank on 13/5/17.
 */
public class App {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloBean");
        helloWorld.printHello();
    }
}
