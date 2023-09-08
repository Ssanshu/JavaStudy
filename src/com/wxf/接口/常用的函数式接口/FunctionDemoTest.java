package com.wxf.接口.常用的函数式接口;

import java.util.function.Function;

/**
 * @Author Ssanshu
 * @Date 2023-09-08
 */
public class FunctionDemoTest {
    public static void main(String[] args) {

        String s = "张三，30";
        covert(s, ss -> s.split("，")[1], Integer::parseInt, i -> i + 70);
    }

    private static void covert(String s, Function<String, String> fun1, Function<String, Integer> fun2, Function<Integer, Integer> fun3) {
        int i = fun1.andThen(fun2).andThen(fun3).apply(s);
        System.out.println(i);
    }
}
