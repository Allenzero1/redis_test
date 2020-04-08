package com.qf.test1;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author zqq
 * @version 1.0
 * @Date 2020/3/2
 */
public class LazyMan {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date name;
    private int age;
   private static  LazyMan lazyMan;

    public LazyMan(){
        LazyMan lazyMan = new LazyMan();
    }

    public synchronized static LazyMan getInstance(){
        return lazyMan==null? new LazyMan():lazyMan;
    }

    public Date getName() {
        return name ;
    }

    public void setName(Date name ) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
