package com.wxf.IO流.字符流;

import java.io.*;

/**
 * @Author Ssanshu
 * @Date 2022-10-17
 */
public class ConversionStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建一个默认字符编码的OutputStreamWriter
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt"));
        // 创建一个使用命名字符集的OutputStreamWriter
        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt"),"GBK");

        // 字符流写
//        osw.write("中国\r\n");
        osw2.write("山西");

        // 释放资源
        osw.close();
        osw2.close();

        // 创建一个使用默认字符集的InputStreamReader
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt"));
        // 创建一个使用命名字符集的InputStreamReader
        InputStreamReader isr2 = new InputStreamReader(new FileInputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt"),"GBK");

        // 字符流读
        // 一次读取一个字符数据
        int len;
//        while ((len = isr.read()) != -1) {
//            System.out.println((char) len);
//        }
        // 一次读取一个字符数组
        char[] bytes = new char[1024];
        while ((len = isr2.read(bytes)) != -1) {
            System.out.println((new String(bytes, 0, len)));
        }

        // 释放资源
        isr.close();
        isr2.close();
    }
}
