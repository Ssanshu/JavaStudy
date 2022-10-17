package com.wxf.IO流.字符缓冲流;

import java.io.*;

/**
 * @Author Ssanshu
 * @Date 2022-10-17
 */
public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建缓冲字符输入流对象
        BufferedReader reader = new BufferedReader(new FileReader("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt"));
        // 创建缓冲字符输出流对象
//        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt"));

        // 写数据
//        writer.write("abcdefg");

        // 一次读取一个字符
        int len;
//        while ((len = reader.read()) != -1) {
//            System.out.println((char) len);
//        }

        // 一次读取一个字符数组数据
        char[] chars = new char[1024];
        while ((len = reader.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));
        }
        // 释放资源
        reader.close();
//        writer.close();

    }
}
