package com.wxf.线程.Lock锁;

/**
 * @Author Ssanshu
 * @Date 2022-10-31
 */
public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();
        Thread th1 = new Thread(st, "1窗口");
        Thread th2 = new Thread(st, "2窗口");
        Thread th3 = new Thread(st, "3窗口");

        th1.start();
        th2.start();
        th3.start();
    }
}
