package com.wxf.接口.常用的函数式接口;

import java.util.function.Consumer;

/**
 * @Author Ssanshu
 * @Date 2023-09-07
 */
public class ConsumerDemo {

    public static void main(String[] args) {
        operatorString("张三", (String s) -> {
            System.out.println(s);
        });

        operatorString("张三", s -> System.out.println(s));

//        operatorString("张三",System.out::println);

        // 反转
        operatorString("张三", s -> System.out.println(new StringBuilder(s).reverse()));

        System.out.println("--------------------------------");

        operatorString("张三", s -> System.out.println(s), s -> System.out.println(new StringBuilder(s).reverse()));

        System.out.println("--------------------------------");

        // 按照格式将信息打印出来
        String[] strArray = {"张三，30","李四，20","王五，40"};
        printInfo(strArray, (String str) -> {
            String name = str.split("，")[0];
            System.out.print("姓名：" + name);
        }, (String str) -> {
            String age = str.split("，")[1];
            System.out.println(",年龄:" + age);
        });

        System.out.println("--------------------------------------------------------");

        printInfo(strArray,str -> System.out.print("姓名：" + str.split("，")[0]),str -> System.out.println("，年龄：" + str.split("，")[1]));


    }

    // Consumer<T>接口也被称为消费型接口，它消费的数据的数据类型由泛型指定
    // default Consumer<T> andThen (Consumer after):返回一个组合的Consumer，依次执行此操作，然后执行after操作
    // 定义一个方法，消费一个字符串数据
    private static void operatorString(String name, Consumer<String> con) {
        con.accept(name);
    }

    private static void operatorString(String name, Consumer<String> con1, Consumer<String> con2) {
//        con1.accept(name);
//        con2.accept(name);

        con1.andThen(con2).accept(name);
    }

    private static void printInfo(String[] strArray, Consumer<String> con1, Consumer<String> con2) {
        for (String str : strArray) {
            con1.andThen(con2).accept(str);
        }
    }
}
