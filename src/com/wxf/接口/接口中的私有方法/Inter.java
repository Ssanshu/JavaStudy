package com.wxf.接口.接口中的私有方法;

/**
 * @Author Ssanshu
 * @Date 2023-09-06
 */
public interface Inter {
    default void show1(){
        System.out.println("s1-1");
//        System.out.println("show");
        show();
        method();
        System.out.println("s1-2");
    }

    default void show2(){
        System.out.println("s2-1");
//        System.out.println("show");
        show();
        method();
        System.out.println("s2-2");
    }
    default void show(){
        System.out.println("show");
    }
    static void method1(){
        System.out.println("m1-1");
        method();
        System.out.println("m1-2");
    }

    static void method2(){
        System.out.println("m2-1");
        method();
        System.out.println("m2-2");
    }

    static void method(){
        System.out.println("method");
    }
}
