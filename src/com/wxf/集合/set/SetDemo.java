package com.wxf.集合.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        //创建结合元素Set
        Set<String> set = new HashSet<String>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("3");
        System.out.println(set);
        // Hashcode 哈希码
        System.out.println("重庆".hashCode());
        System.out.println("成都".hashCode());
    }
}
