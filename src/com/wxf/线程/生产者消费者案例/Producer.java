package com.wxf.线程.生产者消费者案例;

/**
 * @Author Ssanshu
 * @Date 2022-11-02
 */
public class Producer implements Runnable{

    private MilkBox box;

    public Producer(MilkBox box) {
        this.box = box;
    }
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            box.put(i);
        }
    }
}
