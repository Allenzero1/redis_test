package com.qf.test1;

import com.sun.corba.se.impl.orbutil.closure.Future;
import io.lettuce.core.ScriptOutputType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Objects;
import java.util.concurrent.*;

/**
 * @author zqq
 * @version 1.0
 * @Date 2019/12/10
 */
public class redisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private static StringRedisTemplate ss;

    public static void main(String[] args) {
        /*ss.opsForValue().set("sex", "man");
        System.out.println("执行成功！");*/
        ExecutorService executorService = Executors.newFixedThreadPool(3);



        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("计划中的事情2");
            }
        });
        Executors.newScheduledThreadPool(3).schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println(1111);
            }
        },2, TimeUnit.MILLISECONDS);

/*
        for(int n=0;n<10;n++) {
            final int task = n;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        try {
                            if (task<5){
                                Thread.sleep(20);
                                System.err.println("------------------------------------------");
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + " 循环到" + i + " ,loop " + task);
                    }
                }
            });
        }*/


    }
}
