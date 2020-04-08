package com.qf.test1;

import sun.rmi.runtime.NewThreadAction;

/**
 * @author zqq
 * @version 1.0
 * @Date 2020/3/2
 */
public class Test3 {
    public static void main(String[] args) {
        Object o = new Object();
         Thread t1= new  Thread(){
            @Override
            public void run() {
                System.out.println(getName()+getId()+"start");
                synchronized(o){
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(getName()+getId()+"end");
            }
        };
        Thread t3= new Thread(){
            @Override
            public void run() {
                System.out.println(getName()+getId()+":::start");
                synchronized (o){
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                o.notify();
                System.out.println(getName()+getId()+":::end");
            }
        };


        Thread t2= new Thread(){
            @Override
            public void run() {
                System.out.println(getName()+getId()+"::start");
                synchronized (o){
                    try {
                        o.notify();
                        sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName()+getId()+"::end");
                }
            }

        };
        Thread t4=new Thread(){
            @Override
            public void run() {
              synchronized (o){
                  System.out.println(getName()+getId()+"::::start");
              }
            }
        };

        t1.start();
        t2.start();
        //t3.start();
        t4.start();



    }
}
