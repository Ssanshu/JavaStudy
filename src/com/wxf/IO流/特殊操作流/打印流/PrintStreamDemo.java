package com.wxf.IO流.特殊操作流.打印流;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @Author Ssanshu
 * @Date 2022-10-26
 */
public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        PrintStream out = new PrintStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt");

        out.write(97); // 调用父级的方法，转码
        out.println(97); // 自己的方法不转码

        out.close();
    }
}
