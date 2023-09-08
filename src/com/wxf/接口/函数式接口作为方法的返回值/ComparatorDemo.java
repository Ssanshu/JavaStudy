package com.wxf.接口.函数式接口作为方法的返回值;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author Ssanshu
 * @Date 2023-09-07
 */
public class ComparatorDemo {
    public static void main(String[] args) {

        //构造使用的场景
        //定义集合，存储字符串元素
        ArrayList<String> array = new ArrayList<>();
        array.add("a");
        array.add("cc");
        array.add("bbbb");
        array.add("ddd");

        //排序前
        System.out.println("排序前：" + array);

        //排序后
        Collections.sort(array);//自然排序
        System.out.println("自然排序后：" + array);
        Collections.sort(array,getComparator());//比较器排序
        System.out.println("比较器排序后：" + array);

    }

    private static Comparator<String> getComparator() {
        // 匿名内部类
//        Comparator<String> comp = new Comparator<String>(){
//
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//        };
//        return comp;

//        return new Comparator<String>() {
//
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//        };

//        return (String s1,String s2) -> {
//            return s1.length() - s2.length();
//        };

//        return (s1,s2) -> s1.length() - s2.length();
        // 如果方法的返回值是一个函数式接口，我们可以使用Lambda表达式作为结果返回

        return Comparator.comparingInt(String::length);
    }
}
