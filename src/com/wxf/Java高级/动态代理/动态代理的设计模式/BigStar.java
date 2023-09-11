package com.wxf.Java高级.动态代理.动态代理的设计模式;

/**
 * @Author Ssanshu
 * @Date 2023-09-11
 */
public class BigStar implements Star{
    private String name;

    public BigStar(String name) {
        this.name = name;
    }

    public String sing(String name) {
        System.out.println(this.name + "正在唱：" + name);
        return "谢谢！";
    }

    public void dance() {
        System.out.println(this.name + "正在跳舞！");
    }
}
