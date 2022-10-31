package com.wxf.线程.多线程实现方式.继承Thread;

/**
 * @Author Ssanshu
 * @Date 2022-10-31
 */
public class MyThreadDemo {
    public static void main(String[] args) {
        // static Thread currentThread() 返回对当前正在执行的线程对象的引用
        System.out.println(Thread.currentThread().getName());
    }
}
