package com.wxf.集合.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        // 创建Collection集合的对象
        Collection<String> collection = new ArrayList<>();

        // 添加元素：boolean add(E e)

        collection.add("1");
        collection.add("2");
        collection.add("3");
        System.out.println(collection);

        //
    }
}
