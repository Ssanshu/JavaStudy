package com.wxf.集合.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> collation = new ArrayList();
        collation.add("1");
        collation.add("2");
        collation.add("3");

        // 创建迭代器
        // Iterator<E> iterator():返回此集合中元素的迭代器，通过集合的iterator()方法得到
        Iterator<String> it = collation.iterator();
//        System.out.println(it.next());
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);// 迭代器循环遍历
        }

        // 增强for循环遍历
//        for (String s : collation) {
//            System.out.println(s);
//        }
    }
}
