package com.wxf.线程.多线程;

/**
 * @Author Ssanshu
 * @Date 2022-10-27
 */
public class MyThread extends Thread {
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
            if (i == 0){
                System.out.print(i);
            }else {
                System.out.print("," + i);
            }

        }
    }
}
