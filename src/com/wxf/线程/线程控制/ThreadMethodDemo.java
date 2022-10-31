package com.wxf.线程.线程控制;

import com.wxf.线程.多线程实现方式.继承Thread.MyThread;

/**
 * @Author Ssanshu
 * @Date 2022-10-31
 */
public class ThreadMethodDemo {
    public static void main(String[] args) {
        // 创建线程对象
        MyThread th1 = new MyThread("a");
        MyThread th2 = new MyThread("b");
        MyThread th3 = new MyThread("c");
        Thread.currentThread().setName("d");

        // 线程控制
        // static void sleep(long millis) 是当前正在执行的线程停留指定的毫秒数 Thread.sleep(1000);
        // void join()等待这个线程死亡
        // void setDaemon(boolean on)将此线程标记为守护线程，当运行的线程都是守护线程时，Java虚拟机将退出

        th1.setDaemon(true);
        th2.setDaemon(true);
        th3.setDaemon(true);

        // 运行进程
        th1.start();
//        try {
//            th1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        th2.start();
        th3.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
