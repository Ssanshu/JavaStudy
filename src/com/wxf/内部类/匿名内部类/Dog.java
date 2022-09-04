package com.wxf.内部类.匿名内部类;

/**
 * @author Ssanhu
 * @Description:
 * @Date 2022-09-04 15:36
 */
public class Dog {

    public void eat() {
        new Animal() {
            public void eat() {
                System.out.println("狗吃肉");
            }
        }.eat();

        Animal a = new Animal() {
            public void eat() {
                System.out.println("狗吃肉");
            }
        };
        a.eat();
    }
}
