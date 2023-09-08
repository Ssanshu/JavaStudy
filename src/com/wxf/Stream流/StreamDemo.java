package com.wxf.Stream流;

import java.util.ArrayList;

/**
 * @Author Ssanshu
 * @Date 2023-09-08
 */
public class StreamDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("张三三");
        list.add("张二二");
        list.add("张一");
        list.add("李四四");
        list.add("王五");
        list.add("赵六");
        list.add("王六");

        // Stream流一步到位
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() > 1).forEach(System.out::println);
    }
}
