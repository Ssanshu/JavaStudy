package com.wxf.接口.接口中的私有方法;

/**
 * @Author Ssanshu
 * @Date 2023-09-06
 */
public class InterDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        i.show1();
        System.out.println("--------------------------------");
        i.show2();
        System.out.println("--------------------------------");

        Inter.method1();
        System.out.println("--------------------------------");
        Inter.method2();
    }
}
