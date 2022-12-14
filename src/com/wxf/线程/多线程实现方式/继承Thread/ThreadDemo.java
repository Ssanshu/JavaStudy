package com.wxf.线程.多线程实现方式.继承Thread;

/**
 * @Author Ssanshu
 * @Date 2022-10-27
 */
public class ThreadDemo {
    public static void main(String[] args) {
//        MyThread th1 = new MyThread();
//        MyThread th2 = new MyThread();
        // run()方法和start()方法的区别
        /*
        run():封装线程执行的代码，直接调用，相当于普通方法的直接调用
        start():启动线程;然后有JVM调用此线程的run()方法
         */
//        th1.run();
//        th2.run();

        // 多线程

//        设置线程名称
//        th1.setName("a");
//        th2.setName("b");
        MyThread th1 = new MyThread("a");
        MyThread th2 = new MyThread("b");

        th1.start();
        th2.start();
    }
}
