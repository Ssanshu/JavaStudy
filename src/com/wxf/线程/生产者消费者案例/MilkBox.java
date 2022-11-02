package com.wxf.线程.生产者消费者案例;

/**
 * @Author Ssanshu
 * @Date 2022-11-02
 */
public class MilkBox {
    // 表示第几瓶奶
    private int milk;

    private boolean state = false;

    // 提供存储牛奶和获取牛奶的操作
    public synchronized void put(int milk) {
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        this.milk = milk;
        System.out.println("生产第：" + this.milk + "瓶奶");

        state = true;

        notifyAll();
    }

    public synchronized void get() {
        if (!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("用户取得第：" + this.milk + "瓶奶");

        state = false;

        notifyAll();
    }
}
