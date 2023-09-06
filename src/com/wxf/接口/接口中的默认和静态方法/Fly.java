package com.wxf.接口.接口中的默认和静态方法;

/**
 * @Author Ssanshu
 * @Date 2023-09-06
 */
public interface Fly {
    static void fly() {
        System.out.println("Fly");
    }

    static void test(){
        System.out.println("flytest");
    }
}
