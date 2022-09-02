package com.wxf.形参和返回值;

/**
 * @author Ssanhu
 * @Description:
 * @Date 2022-09-03 0:34
 */
public class Dog implements Animal{

    @Override
    public void eat(String s) {
        System.out.println("狗吃" + s);
    }
}
