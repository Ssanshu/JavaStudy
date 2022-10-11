package com.wxf.集合.set.不重复的随机数;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class setDemo {
    public static void main(String[] args) {
        // 创建集合
//        Set<Integer> set = new HashSet<Integer>(); // 无序
        Set<Integer> set = new TreeSet<Integer>(); // 自然排序
        Random r = new Random();
        while (set.size() < 10) {
            int num = r.nextInt(20) + 1;
            set.add(num);
        }
        for (int i : set) {
            System.out.println(i);
        }
    }
}
