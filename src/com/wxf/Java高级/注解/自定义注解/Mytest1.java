package com.wxf.Java高级.注解.自定义注解;

/**
 * @Author Ssanshu
 * @Date 2023-09-11
 */

/**
 * 自定义注解
 * @author Ssanshu
 */
public @interface Mytest1 {
     String name();
     int age() default 23;
     boolean  ccc();
     int[] aaa();
}
