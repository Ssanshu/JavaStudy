package com.wxf.集合.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // 创建集合对象
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(1);
        ts.add(2);
        ts.add(4);
        ts.add(3);

//        for (Integer i : ts){
//            System.out.println(i);
//        }
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
