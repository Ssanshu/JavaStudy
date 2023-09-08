package com.wxf.接口.常用的函数式接口;

import java.util.function.Function;

/**
 * @Author Ssanshu
 * @Date 2023-09-08
 */
public class FunctionDemo {

    /*
        Function<T,R>: 常用的两分方法
            R apply(T t):将此函数应用于给定的参数
            default<V> Function andThen (Function after)，返回一个组合函数，首先将该函数应用于输入，然后将after函数应用于结果
            Function<T,R>j接口通常用于对参数进行处理，转换（处理逻辑由Lambda表达式实现），然后返回一个新的值
     */

    public static void main(String[] args) {
        String s = "100";
        convert(s, i1 -> Integer.parseInt(s));

        int i = 100;
        convert(i, s1 -> String.valueOf(i + 666));

        convert(s, s2 -> Integer.parseInt(s), i2 -> String.valueOf(i2 + 777));
    }

    // 定义一个方法，把一个字符串转换int类型，往控制台输出
    private static void convert(String s, Function<String, Integer> fun) {
        Integer i = fun.apply(s);
        System.out.println(i);
    }

    // 定义一个方法，把一个int类型的数据加上一个整形之后，转为字符串在控制台输出
    private static void convert(Integer i, Function<Integer, String> fun) {
        String s = fun.apply(i);
        System.out.println(s);
    }

    // 定义一个方法，把一个字符串转换int类型，把int类型的数据加上一个整数之后，转为字符串在控制台输出
    private static void convert(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
//        Integer i = fun1.apply(s);
//        String ss = fun2.apply(i);

        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }
}
