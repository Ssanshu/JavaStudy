package com.wxf.接口.函数式接口;

/**
 * @Author Ssanshu
 * @Date 2023-09-07
 */
public class MyinterfaceDemo {
    public static void main(String[] args) {
        MyInterface my = () -> System.out.println("Hello");
        my.show();
    }
}
