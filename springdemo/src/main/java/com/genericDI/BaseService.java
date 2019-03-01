package com.genericDI;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by IntelliJ IDEA.
 * User: jinshengyuan
 * Date: 2019-02-28
 * Time: 13:39
 * description:
 **/
public class BaseService<T> {
    @Autowired
    protected  BaseRepository<T> baseRepository;

    void add(T t){
        System.out.println("add........"+t.getClass().getName());
    }
}
