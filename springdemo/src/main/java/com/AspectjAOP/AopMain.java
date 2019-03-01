package com.AspectjAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: jinshengyuan
 * Date: 2019-03-01
 * Time: 9:03
 * description:
 **/
public class AopMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-aop.xml");
        CalculateImpl calculate =  applicationContext.getBean(CalculateImpl.class);
        int result =  calculate.addition(2,3);
        System.out.println(result);
    }
}
