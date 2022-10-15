package com.wxf.集合.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @Author Ssanhu
 * @Date 2022-10-11
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        // 创建集合对象
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(3);
        list.add(0);
        list.add(2);
        list.add(4);

        Collections.sort(list);
        Collections.reverse(list);
        Collections.shuffle(list);

        System.out.println(list);
    }
}
