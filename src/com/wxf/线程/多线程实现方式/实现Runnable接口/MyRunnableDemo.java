package com.wxf.线程.多线程实现方式.实现Runnable接口;

/**
 * @Author Ssanshu
 * @Date 2022-10-31
 */
public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();
        // 创建线程对象
        // Thread (Runnable target,String name)
        Thread th = new Thread(my,"Hello World");

//        th.setName("My Runnable");

        th.start();
    }
}
