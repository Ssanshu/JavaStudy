package com.wxf.Java高级.注解.自定义注解;

/**
 * @Author Ssanshu
 * @Date 2023-09-11
 */
public @interface Mytest2 {
    String value();
    int a() default 24;
//    String name();
}

