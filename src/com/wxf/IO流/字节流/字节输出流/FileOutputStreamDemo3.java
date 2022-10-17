package com.wxf.IO流.字节流.字节输出流;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author Ssanhu
 * @Date 2022-10-15
 */
public class FileOutputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        // 创建输出字节流对象
        // public FileOutputStream(String name, boolean append)追加写入在（）加一个true
        FileOutputStream filetext = new FileOutputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt",true);

        // 将指定的字节写入此文件输出流
        for (int i = 0; i <5;i++) {
            filetext.write("b".getBytes());
            filetext.write(99);
            /*
              字节流各系统换行：
              win：\r\n
              linux:\n
              mac:\r
             */
            filetext.write("\r\n".getBytes());
        }

        // 释放资源，关闭此文件输出流并释放与此流相关联的任何系统资源
        filetext.close();
    }
}
