package com.wxf.接口.接口中的默认和静态方法;

/**
 * @Author Ssanshu
 * @Date 2023-09-06
 */
public interface Inter {
    void show();

    default void method(){
        System.out.println("默认方法！");
    }

    static void test(){
        System.out.println("静态方法！");
    }
}
