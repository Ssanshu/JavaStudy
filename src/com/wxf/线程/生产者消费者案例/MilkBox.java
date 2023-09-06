package com.wxf.线程.生产者消费者案例;

/**
 * @Author Ssanshu
 * @Date 2022-11-02
 */
public class MilkBox {
    // 表示第几瓶奶
    private int milk;

    private boolean state = false;

    /*
    void wait() 导致当前线程等待，回到另一个线程调用该对象的notify()方法或notifyAll()方法
    void notify() 唤醒正在等待对象监视器的单个线程
    void notifyAll() 唤醒正在等待对象监视器的所有线程
     */

    // 提供存储牛奶和获取牛奶的操作
    public synchronized void put(int milk) {
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        // 生产牛奶
        this.milk = milk;
        System.out.println("生产第：" + this.milk + "瓶奶");

        // 修改奶箱状态
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

        // 消费牛奶
        System.out.println("用户取得第：" + this.milk + "瓶奶");

        // 修改奶箱状态
        state = false;

        notifyAll();
    }
}
