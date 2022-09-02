package com.wxf.形参和返回值;

/**
 * @author Ssanhu
 * @Description:
 * @Date 2022-09-03 0:34
 */
public class Test {
    public static void main(String[] args) {
        BlackDog BDog = new BlackDog();
        Animal dog = new Dog();
        BDog.eat(dog);
        BDog.eat().eat("骨头");
    }
}
