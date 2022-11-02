package com.wxf.线程.线程同步.卖票;

/**
 * @Author Ssanshu
 * @Date 2022-10-31
 */
public class SellTicket implements Runnable {
    private static int tickets = 1000;
    private final Object obj = new Object();
    private int x = 0;

    /*
    判断多线程是否会有数据安全问题的标准：
    1.是否是多线程环境
    2.是否有共享数据
    3.是否有多条语句操作共享数据
     */

    /*
    同步方法：就是把synchronezed关键字加到方法上
    格式：
        修饰符 synchronized 返回值类型 方法名（方法参数）{}
    同步方法的锁对象是什么呢？
        this
    同步静态方法：就是把synchronezed关键字加到静态方法上
    格式：
        修饰符 static synchronized 返回值类型 方法名（方法参数）{}
    同步静态方法的锁对象是什么呢？
        类名.class
     */
    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
                synchronized (SellTicket.class) {
                    if (tickets > 0) {
                        System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets + "张票！");
                        tickets--;
                    }
                }
            } else {
                sellTickets();
            }
            x++;
        }
    }

//    private synchronized void sellTickets() {
//        if (tickets > 0) {
//            System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets + "张票！");
//            tickets--;
//        }
//    }
private static synchronized void sellTickets() {
    if (tickets > 0) {
        System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets + "张票！");
        tickets--;
    }
}
}

