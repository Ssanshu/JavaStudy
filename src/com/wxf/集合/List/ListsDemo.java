package com.wxf.集合.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListsDemo {
    public static void main(String[] args) {
        // 创建集合对象ArrayList
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");

        for (String s : arrayList) {
            System.out.println(s);
        }

        System.out.println("--------------------------------");

        // 创建集合对象LinkedList
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        for (String s : linkedList) {
            System.out.println(s);
        }

        System.out.println("--------------------------------");

        Iterator<String> it = linkedList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
