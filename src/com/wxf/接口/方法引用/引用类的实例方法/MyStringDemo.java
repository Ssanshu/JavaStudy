package com.wxf.接口.方法引用.引用类的实例方法;

/**
 * @Author Ssanshu
 * @Date 2023-09-07
 */
public class MyStringDemo {
    public static void main(String[] args) {
//        useMyString((String s,int x,int y) -> {
//            return s.substring(x,y);
//        });
        useMyString(( s, x, y) -> s.substring(x,y));


        // 引用类的实例方法
        // 格式：类名::成员方法
        useMyString(String::substring);

        // Lambda表达式被类的实例方法替代的时候
        // 第一个参数作为调用者
        // 后面的参数全部传递给该方法作为参数
    }

    private static void useMyString(MyString my) {
        String s = my.mySubString("hello", 2, 4);
        System.out.println(s);
    }
}
