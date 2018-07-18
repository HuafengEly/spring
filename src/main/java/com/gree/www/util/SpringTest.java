package com.gree.www.util;

import com.gree.www.entity.User;
import com.gree.www.service.TestService;
import com.gree.www.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    public static void main(String args[])throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
        UserService userService = (UserService) context.getBean("userService");
        User user = userService.selectUser(1);
        System.out.println(user.toString());
//        TestService testService = (TestService) context.getBean("testService");
//        testService.test();
    }
}

