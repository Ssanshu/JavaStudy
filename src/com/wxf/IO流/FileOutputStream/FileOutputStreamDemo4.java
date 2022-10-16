package com.wxf.IO流.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author Ssanhu
 * @Date 2022-10-15
 */
public class FileOutputStreamDemo4 {
    public static void main(String[] args) {
        // 创建输出字节流对象
        FileOutputStream filetext = null;
        // 加入finally来实现释放资源
        try {
            filetext = new FileOutputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt");

            // 将指定的字节写入此文件输出流
            filetext.write(97);
            filetext.write(98);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 释放资源，关闭此文件输出流并释放与此流相关联的任何系统资源 filetext.close();
            if (filetext != null) {
                try {
                    System.out.println("释放资源");
                    filetext.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
