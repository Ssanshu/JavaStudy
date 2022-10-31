package com.wxf.线程.线程优先级;

import com.wxf.线程.多线程实现方式.继承Thread.MyThread;

/**
 * @Author Ssanshu
 * @Date 2022-10-31
 */
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        // 创建线程对象
        MyThread th1 = new MyThread("a");
        MyThread th2 = new MyThread("b");
        MyThread th3 = new MyThread("c");

        // 设置优先级
        th1.setPriority(1);
        th2.setPriority(3);
        th3.setPriority(5);

        // 获取优先级
        System.out.println(th1.getPriority());
        System.out.println(th2.getPriority());
        System.out.println(th3.getPriority());

        // 运行线程
        th1.start();
        th2.start();
        th3.start();
    }
}
