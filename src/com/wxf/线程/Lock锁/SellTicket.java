package com.wxf.线程.Lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author Ssanshu
 * @Date 2022-10-31
 */
public class SellTicket implements Runnable {
    private static int tickets = 1000;

    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets + "张票！");
                    tickets--;
                }
            }finally {
                lock.unlock();
            }
        }

    }
}

