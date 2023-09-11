package com.wxf.Java高级.动态代理.动态代理的设计模式;

/**
 * @Author Ssanshu
 * @Date 2023-09-11
 */
public class Test {
    public static void main(String[] args) {
        BigStar s = new BigStar("杨超越");
        Star starProxy = ProxyUtil.createProxy(s);
        String end = starProxy.sing("燃烧我的卡路里");
        System.out.println(end);
        starProxy.dance();
    }
}
