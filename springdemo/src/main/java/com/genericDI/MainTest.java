package com.genericDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: jinshengyuan
 * Date: 2019-02-28
 * Time: 13:56
 * description:
 **/
public class MainTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new  ClassPathXmlApplicationContext("bean-genericDI.xml");
        UserService u = (UserService) applicationContext.getBean("userService");
        User user = new User();
        user.setId("111");
        user.setName("aaaa");
        u.add(user);
    }

    public void testOne(){

    }
}
