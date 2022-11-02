package com.wxf.线程.生产者消费者案例;

/**
 * @Author Ssanshu
 * @Date 2022-11-02
 */
public class TestDemo {
    public static void main(String[] args) {
        MilkBox box = new MilkBox();

        Producer p = new Producer(box);
        Customer c = new Customer(box);

        Thread th1 = new Thread(p);
        Thread th2 = new Thread(c);

        th1.start();
        th2.start();
    }
}
