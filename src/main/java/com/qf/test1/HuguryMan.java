package com.qf.test1;

/**
 * @author zqq
 * @version 1.0
 * @Date 2020/3/2
 */
public class HuguryMan {

    private static HuguryMan huguryMan=new HuguryMan();


    private HuguryMan() {
    }

    public static HuguryMan getInstance(){
        return  huguryMan;
    }
}
