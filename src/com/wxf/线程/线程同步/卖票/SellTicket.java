package com.wxf.线程.线程同步.卖票;

/**
 * @Author Ssanshu
 * @Date 2022-10-31
 */
public class SellTicket implements Runnable {
    private int tickets = 1000;
    private final Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets + "张票！");
                    tickets--;
                }
            }
        }
    }
}

