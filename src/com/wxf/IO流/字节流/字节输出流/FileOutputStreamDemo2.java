package com.wxf.IO流.字节流.字节输出流;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author Ssanhu
 * @Date 2022-10-16
 */
public class FileOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
//        File file = new File("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\fileOutputStream.txt");
//        System.out.println(file.createNewFile());
        // 1. FileOutputStream(String name):创建文件输出流以指定的名称写入文件
        FileOutputStream f = new FileOutputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\fileOutputStream.txt");

        // 2. FileOutputStream(File file):创建文件输出流以指定的File对象表示的文件
//        File filetest = new File("D:\\Study\\javaBasicsStudy");
//        FileOutputStream fileOutputStream1 = new FileOutputStream(filetest);

        // void write(int b):将指定的字节写入此文件输出流
//        f.write(62);
//        f.write(63);
//        f.write(64);
//        f.write(65);

        // void write(byte[] b):将b.length字节从指定的字节数组写入此文件输入流
//        byte[] b = {97,98,99,100,101};
        byte[] b = "abcdef".getBytes();
//        f.write(b);

        // void write(byte[] b, int off, int len);将len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流
        f.write(b,2,2);

        // 释放资源
        f.close();
    }

}
