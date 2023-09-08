package com.wxf.接口.常用的函数式接口;

import java.sql.SQLOutput;
import java.util.function.Supplier;

/**
 * @Author Ssanshu
 * @Date 2023-09-07
 */
public class SupplierDemo {
    public static void main(String[] args) {
//        String s =  getString(() -> {
//            return "张三";
//        });

        String s = getString(() -> "张三");
        System.out.println(s);

        int j = getInteger(() -> 30);
        System.out.println(j);

        int[] arr = {2, 4, 3, 6, 5};

        int maxNum = getMax(() -> {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        });
        System.out.println(maxNum);
    }

    // 定义一个方法，返回一个字符串数据
    // Supplier<T>接口也被称为生产型接口，如果我们指定了接口的泛型是什么类型，那么接口中的get方法就会生产什么类型的数据供使用
    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static int getInteger(Supplier<Integer> sup) {
        return sup.get();
    }

    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }
}
