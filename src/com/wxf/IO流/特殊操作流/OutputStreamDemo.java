package com.wxf.IO流.特殊操作流;

import java.io.PrintStream;

/**
 * @Author Ssanshu
 * @Date 2022-10-26
 */
public class OutputStreamDemo {
    public static void main(String[] args) {
        PrintStream out = System.out;
        out.println(123);
        out.print(234);
    }
}
