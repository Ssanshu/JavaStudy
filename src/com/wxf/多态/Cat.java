package com.wxf.多态;

/**
 * @author Ssanhu
 * @Description:
 * @Date 2022-09-03 0:17
 */
public class Cat extends Animal{
    @Override
    public void eat(String s) {
        System.out.println("猫吃" + s);
    }
}
