package com.qf.test1;


import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * @author zqq
 * @version 1.0
 * @Date 2020/3/2
 */
public class Test5 {
    public static void main(String[] args) {
        LazyMan lazyMan = new LazyMan();
        lazyMan.setName( new Date());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(new Date());
        System.out.println(format);
        System.out.println(new Time(10000l));
        System.out.println(lazyMan.getName());
    }
}
