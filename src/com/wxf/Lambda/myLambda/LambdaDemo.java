package com.wxf.Lambda.myLambda;

/**
 * @Author Ssanshu
 * @Date 2023-02-20
 */
public class LambdaDemo {
    /*
    需求：启动一个线程，在控制台输出一句话：多线程程序启动了
     */
    public static void main(String[] args) {

        // 方法一：
        // 外部类
//        MyRunnable my = new MyRunnable();
//        Thread th = new Thread(my);
//        th.start();

        // 方法二：
        // 匿名内部类
//        new Thread(new MyRunnable(){
//            @Override
//            public void run() {
//                System.out.println("多线程程序启动了");
//            }
//        }).start();

        // 方法三
        // Lambda表达式的方法改进
        new Thread(() -> {
            System.out.println("多线程程序启动了");
        }).start();
    }
}
