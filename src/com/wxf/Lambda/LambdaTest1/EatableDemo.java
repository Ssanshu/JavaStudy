package com.wxf.Lambda.LambdaTest1;

/**
 * @Author Ssanshu
 * @Date 2023-02-20
 */
public class EatableDemo {
    public static void main(String[] args) {
//         在方法中调用eat方法
        EatableImpl e = new EatableImpl();
        eat(e);

        // 匿名内部类
        eat(new Eatable() {
            @Override
            public void eat() {
                System.out.println("吃饱啦!!");
            }
        });

        // Lambda表达式
        eat(() -> {
            System.out.println("吃饱啦!!!");
        });
    }

    private static void eat(Eatable e) {
        e.eat();
    }
}
