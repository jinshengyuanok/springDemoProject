package com.AspectjAOP;

import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: jinshengyuan
 * Date: 2019-03-01
 * Time: 8:51
 * description:
 **/
@Component
public class CalculateImpl implements Calculate{
    @Override
    public int addition(int a, int b) {
        return a+b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a-b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a*b;
    }

    @Override
    public int division(int a, int b) {
        return a/b;
    }
}
