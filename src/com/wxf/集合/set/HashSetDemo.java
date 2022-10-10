package com.wxf.集合.set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("c");
        System.out.println(hashSet);

        // 遍历
        for (String s : hashSet){
            System.out.println(s)  ;
        }
    }
}
