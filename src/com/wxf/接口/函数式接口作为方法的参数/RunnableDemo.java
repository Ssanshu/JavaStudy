package com.wxf.接口.函数式接口作为方法的参数;

/**
 * @Author Ssanshu
 * @Date 2023-09-07
 */
public class RunnableDemo {
    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "," + "线程启动了！");
            }
        });

        // 如果方法的参数是一个函数式接口，我们可以使用Lambda表达式作为参数传递
        startThread(() -> System.out.println(Thread.currentThread().getName() + "," + "线程启动了！"));

    }

    private static void startThread(Runnable r) {
        new Thread(r).start();
    }
}
