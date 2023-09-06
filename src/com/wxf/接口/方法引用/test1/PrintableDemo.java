package com.wxf.接口.方法引用.test1;

/**
 * @Author Ssanshu
 * @Date 2023-09-06
 */
public class PrintableDemo {
    public static void main(String[] args) {

        // 在主方法中调用usePrintable方法

        usePrintable(s -> System.out.println(s));

        // 方法引用符：::
        usePrintable(System.out::println);
        // 可推导的就是可省略的
    }

    private static void usePrintable(Printable p) {
        p.printString("爱生活，爱Java");
    }


}
