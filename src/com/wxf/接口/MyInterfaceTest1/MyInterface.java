package com.wxf.接口.MyInterfaceTest1;

/**
 * @Author Ssanshu
 * @Date 2023-09-06
 */
public interface MyInterface {
    void show1();

    void show2();

//    void show3();

    default void show3() {
        System.out.println("shwo3");
    }
}
