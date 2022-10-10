package com.wxf.集合.List;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        list.add("1");
        list.add("2");
        list.add("3");


        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.addFirst("0");
        list.addFirst("-1");
        list.addLast("4");
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

    }
}
