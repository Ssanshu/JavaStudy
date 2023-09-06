package com.wxf.接口.接口中的默认和静态方法;

/**
 * @Author Ssanshu
 * @Date 2023-09-06
 */
public class InterDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        i.show();
        i.method();

        Inter.test();
        Fly.fly();
        Fly.test();
    }
}
