package com.wxf.内部类.匿名内部类;

/**
 * @author Ssanhu
 * @Description:
 * @Date 2022-09-04 15:36
 */
public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();

        AllAnimal all = new AllAnimal();
        all.eat(new Animal(){
            @Override
            public void eat() {
                System.out.println("狗吃骨头");
            }
        });

    }
}
