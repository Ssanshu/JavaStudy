package com.wxf.Lambda.LambdaTest5;

import com.wxf.Lambda.myLambda.MyRunnable;

/**
 * @Author Ssanshu
 * @Date 2023-09-06
 */
public class LambdaDemo {

    /*
    Lambda表达式的注意事项
     */

    public static void main(String[] args) {
        useInter(() -> {
            System.out.println("好好学习，天天向上！");
        });

        // 使用Lambda必须要有接口，并且要求接口中有且仅有一个抽象方法

        useInter(() -> System.out.println("好好学习，天天向上！"));

        //必须有上下文环境，才能推导出Lambda对应的接口
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        }).start();

        //局部变量的赋值
        Runnable r =  () -> System.out.println("Lambda表达式");
        new Thread(r).start();

        // 调用方法的参数
        new Thread(() -> System.out.println("Lambda表达式")).start();
    }

    public static void useInter(Inter i){
        i.show();
    }
}
