package com.wxf.线程.多线程实现方式.继承Thread;

/**
 * @Author Ssanshu
 * @Date 2022-10-27
 */
public class MyThread extends Thread {

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }
    /*
    多线程的实现方法：
    方式1：继承Thread类
        定义一个类MyThread继承Thread类
        在MyThread类中重写run()方法
        创建MyThread类的对象
        启动线程
     */

    /*
    为什么重写run()方法？
    因为run()是用来封装被线程执行的代码
     */
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
//            try {
//                // static void sleep(long millis) 是当前正在执行的线程停留指定的毫秒数
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            System.out.println(getName() + ":" + i);
        }
    }
}
