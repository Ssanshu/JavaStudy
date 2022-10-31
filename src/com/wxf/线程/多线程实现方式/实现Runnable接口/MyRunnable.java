package com.wxf.线程.多线程实现方式.实现Runnable接口;

/**
 * @Author Ssanshu
 * @Date 2022-10-31
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <30; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
