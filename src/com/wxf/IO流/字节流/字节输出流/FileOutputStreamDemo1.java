package com.wxf.IO流.字节流.字节输出流;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author Ssanhu
 * @Date 2022-10-15
 */
public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建输出字节流对象
        FileOutputStream filetext = new FileOutputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt");

        // 将指定的字节写入此文件输出流
        filetext.write(97);
        filetext.write(62);

        // 释放资源，关闭此文件输出流并释放与此流相关联的任何系统资源
        filetext.close();
    }
}
