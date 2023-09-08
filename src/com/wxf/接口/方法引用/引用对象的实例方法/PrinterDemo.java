package com.wxf.接口.方法引用.引用对象的实例方法;

/**
 * @Author Ssanshu
 * @Date 2023-09-06
 */
public class PrinterDemo {
    public static void main(String[] args) {

        // 在主方法中调用usePrinter方法
        usePrinter((String s) -> {
            System.out.println(s.toUpperCase());
        });

        usePrinter(s -> System.out.println(s.toUpperCase()));

        // 引用对象的实例方法
        // 对象::成员方法
        PrintString ps = new PrintString();
        usePrinter(ps::printUpper);

        // Lambda表达式对对象的实例方法替代的时候，它的形式参数全部传递给该方法作为参数
    }

    private static void usePrinter(Printer p) {
        p.printUpperCase("hello");
    }
}
