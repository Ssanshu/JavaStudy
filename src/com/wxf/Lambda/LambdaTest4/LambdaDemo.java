package com.wxf.Lambda.LambdaTest4;

/**
 * @Author Ssanshu
 * @Date 2023-09-06
 */
public class LambdaDemo {
    public static void main(String[] args) {
//        useAddable((int x ,int y) -> {
//            return x + y;
//        });

        // 参数类型可以省略,但是不能只省略一个参数类型
        useAddable((x,y) -> {
            return x + y;
        });

        useFlyable((s) -> {
            System.out.println(s + "自驾游！");
        });

        //如果参数只有且仅有一个，那么小括号可以省略
        useFlyable(s -> {
            System.out.println(s + "自驾游！！");
        });

        // 如果代码块的语句只有一条，可以省略大括号和分号，如果有return，return也要省略掉
        useFlyable(s -> System.out.println(s + "自驾游！！！"));

        useAddable((x,y) -> x + y);
    }

    public static void useAddable(Addable a){
        int sum = a.add(10, 20);
        System.out.println(sum);
    }

    public static void useFlyable(Flyable a){
        a.fly("风和日丽");
    }
}
