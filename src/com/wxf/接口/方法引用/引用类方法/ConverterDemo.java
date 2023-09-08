package com.wxf.接口.方法引用.引用类方法;

/**
 * @Author Ssanshu
 * @Date 2023-09-06
 */
public class ConverterDemo {
    public static void main(String[] args) {

//        useConverter((String s) -> {
//            return Integer.parseInt(s);
//        });

//        useConverter(s -> Integer.parseInt(s));

        // 引用类方法
        // 类名::静态方法
        useConverter(Integer::parseInt);

        //Lambda表达式被类方法代替的时候，它的形式参数全部传递给静态方法作为参数
    }

    private static void useConverter(Converter c) {
        int number =  c.convert("789");
        System.out.println(number);
    }


}
