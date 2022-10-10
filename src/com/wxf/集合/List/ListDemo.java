package com.wxf.集合.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);
        System.out.println(list.contains("1"));
        list.add(1,"0");// 增
        list.remove(0);// 删
        list.set(1, "1");// 改
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }

}
