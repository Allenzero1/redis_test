package com.qf.test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author zqq
 * @version 1.0
 * @Date 2020/3/2
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("2222");
        list.add("23333");
        HashMap<Object, Object> map = new HashMap<>();
        map.put("aa", 123);
        map.put("bb", "123123");
        Set<Object> objects = map.keySet();
        for (Object object : objects) {
            System.out.println(object+":"+map.get(object));



            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()){
                String next = iterator.next();
                System.out.println("----"+next);
            }
        }      }

}
