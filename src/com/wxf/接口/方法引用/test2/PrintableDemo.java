package com.wxf.接口.方法引用.test2;

/**
 * @Author Ssanshu
 * @Date 2023-09-06
 */
public class PrintableDemo {
    public static void main(String[] args) {

        // 在主方法中调用usePrintable方法

        usePrintable(i -> System.out.println(i));

        // 方法引用符：::
        usePrintable(System.out::println);
        // 可推导的就是可省略的
    }

    private static void usePrintable(Printable p) {
        p.printString(6);
    }


}
