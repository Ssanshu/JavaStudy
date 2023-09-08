package com.wxf.接口.常用的函数式接口;

import java.util.function.Predicate;

/**
 * @Author Ssanshu
 * @Date 2023-09-07
 */
public class PredicateDemo {
    public static void main(String[] args) {
        boolean b1 = checkString("hello", (String s) -> {
            return s.length() > 8;
        });
        System.out.println(b1);

        boolean b2 = checkString("hello", s -> s.length() > 8);
        System.out.println(b2);

        boolean b3 = checkString("helloworld", s -> s.length() > 8);
        System.out.println(b3);

        System.out.println("--------------------------------");

        boolean b4 = checkString("helloworld", s -> s.length() > 8, s -> s.length() < 15);
        System.out.println(b4);
    }

    private static boolean checkString(String s, Predicate<String> pre) {
//        return pre.test(s);
        // 逻辑非得操作
        return pre.negate().test(s);
    }

    private static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
//        boolean b1 = pre1.test(s);
//        boolean b2 = pre2.test(s);
//        boolean b = b1 && b2;
//        return b;
        // default Predicate<T> and (Predicate other): 返回一个组合判断，对应短路与
//        return pre1.and(pre2).test(s);

        // default Predicate<T> or (Predicate other): 返回一个组合判断，对应短路或
        return pre1.or(pre2).test(s);
    }
}
