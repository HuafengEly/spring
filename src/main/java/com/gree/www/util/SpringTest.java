package com.gree.www.util;

import com.gree.www.dao.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.setMessage("message_set");
        helloWorld.printMessage();
    }

}

