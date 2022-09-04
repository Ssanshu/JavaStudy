package com.wxf.System;

/**
 * @author Ssanhu
 * @Description:
 * @Date 2022-09-04 16:22
 */
public class Test {

    public static void main(String[] args) {
//        System.out.println("开始");
//        System.exit(0); // exit 终止程序
//        System.out.println("结束");

        System.out.println(System.currentTimeMillis()); // 返回当前时间（以毫秒为单位） 从1970年1月1日开始
        System.out.println(System.currentTimeMillis()*1.0/1000/60/60/24/365); // 返回距今多少年

        Long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            System.out.println(i);
        }
        Long end = System.currentTimeMillis();
        // 获取运行时间
        Long result = end - start;
        System.out.println("共耗时：" + result + "毫秒");
    }
}
