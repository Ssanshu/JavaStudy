package com.wxf.接口.常用的函数式接口;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @Author Ssanshu
 * @Date 2023-09-07
 */
public class PredicateDemoTest {
    public static void main(String[] args) {

        String[] strArray = {"张三，10", "李四一，20", "王五二，30", "赵六，40"};
        ArrayList<String> arrayList =  myFilter(strArray, str -> str.split("，")[0].length() <= 2, str -> Integer.parseInt(str.split("，")[1]) > 30);

        for (String str : arrayList){
            System.out.println(str);
        }
    }


    private static ArrayList<String> myFilter(String[] str, Predicate<String> pre1, Predicate<String> pre2) {

        // 定义一个集合
        ArrayList<String> array = new ArrayList<>();

        // 遍历判断返回
        for (String s : str) {
            if (pre1.and(pre2).test(s)) {
                array.add(s);
            }
        }

        return array;
    }
}
