package com.wxf.集合.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");

        // 并发异常ConcurrentModificationException
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String value = iterator.next();
//            if (value.equals("1")) {
//                list.add("0");
//            }
//            System.out.println(list);
//        }

        // 解决方法
        // 1.for循环解决
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).equals("1")){
//                list.add(1,"0");
//            }
//        }
//        System.out.println(list);

        // 2.ListIterator解决
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            String value = lit.next();
            if (value.equals("1")) {
                lit.add("0");
            }
        }
        System.out.println(list);
    }
}
