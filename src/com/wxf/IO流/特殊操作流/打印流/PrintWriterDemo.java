package com.wxf.IO流.特殊操作流.打印流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author Ssanshu
 * @Date 2022-10-26
 */
public class PrintWriterDemo {

    public static void main(String[] args) throws IOException {
        // PrintWriter (String fileName):使用指定的文件名创建一个新的PrintWriter，而不需要自动执行刷新
        // PrintWriter (Writer out,Boolean autoFlush):创建一个新的PrintWriter
//                out：字符输出流
//                autoFlush:一个布尔值，如果为真，则println，printf，或format方法将刷新输出缓冲区

        // 第一种
//        PrintWriter pw = new PrintWriter("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt");
//        pw.println(234);
//        pw.write(123);
//        pw.flush();

        // 第二种
        PrintWriter pw = new PrintWriter(new FileWriter("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt"), true);
        pw.println(123);

        pw.close();
    }
}
