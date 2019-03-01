package com.AspectjAOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: jinshengyuan
 * Date: 2019-03-01
 * Time: 8:53
 * description:
 **/
@Aspect  //Aspectj注解
@Component  //将LoggingAspectjAop加入到IOC容器中的注解
public class LoggingAspectjAop {
   // @Before(value = "execution(* com.AspectjAOP.CalculateImpl.*.*(int,int))")
    //前置通知
    @Before("execution(* com.AspectjAOP.CalculateImpl.addition(int,int))")
    public void printLoggingBefore(){
        System.out.println("the method " );
    }

    /*public void printLoggingBefore(Joinpoint joinpoint){
        String methodName = joinpoint.getClass().getName();
        System.out.println("the method " +methodName+ " executed" );
    }*/
}
