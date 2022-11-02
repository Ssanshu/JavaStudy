package com.wxf.线程.生产者消费者案例;

/**
 * @Author Ssanshu
 * @Date 2022-11-02
 */
public class Customer implements Runnable {
    private MilkBox box;

    public Customer(MilkBox box) {
        this.box = box;
    }

    @Override
    public void run() {
        while (true) {
            box.get();
        }
    }
}
