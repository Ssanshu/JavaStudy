package com.wxf.Lambda.LambdaTest2;

/**
 * @Author Ssanshu
 * @Date 2023-09-06
 */
public class FlyableDemo {
    public static void main(String[] args) {

        // 外部类
        FlyableImpl f = new FlyableImpl();
        f.fly("自家飞");

        System.out.println("--------------------------------");

        // 匿名内部类
        useFlyable(new Flyable() {

            @Override
            public void fly(String s) {
                System.out.println(s + "自驾游！");
            }
        });

        System.out.println("--------------------------------");

        // Lambda
        useFlyable((String s) -> {
            System.out.println(s + "自驾游！！");
        });
    }

    private static void useFlyable(Flyable f) {
        f.fly("风和日丽");
    }

}
