package com.wxf.IO流.字节流.字节输入流;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author Ssanhu
 * @Date 2022-10-16
 */
public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建输入字节流对象
        FileInputStream f = new FileInputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt");

        // 第一次读文件
//        int result = f.read();
//        System.out.print(result);
        // 强制转换char类型
//        System.out.print((char)result);

        // 第二次读文件
//        result = f.read();
//        System.out.print(result);
        // 强制转换char类型
//        System.out.print((char)result);

        // 文件读取到末尾为-1
        // 多次读文件
        int results;
        while((results = f.read()) != -1) {
            System.out.print((char)results);
        }

        // 释放资源
        f.close();
    }
}
