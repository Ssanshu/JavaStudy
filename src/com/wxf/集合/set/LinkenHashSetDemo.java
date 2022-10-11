package com.wxf.集合.set;

import java.util.LinkedHashSet;

public class LinkenHashSetDemo {
    public static void main(String[] args) {
        // 创建集合对象
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("1");
        linkedHashSet.add("2");
        linkedHashSet.add("3");
        linkedHashSet.add("1");

        for (String key : linkedHashSet) {
            System.out.println(key);
        }
    }

}
