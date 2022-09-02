package com.wxf.多态;

/**
 * @author Ssanhu
 * @Description:
 * @Date 2022-09-03 0:20
 */
public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.eat("鱼");
        dog.eat("肉");
    }
}
