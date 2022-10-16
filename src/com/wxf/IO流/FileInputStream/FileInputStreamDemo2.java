package com.wxf.IO流.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author Ssanhu
 * @Date 2022-10-16
 */
public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 创建输入字节流对象
        FileInputStream f = new FileInputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt");

        // 第一次读文件
        byte[] bytes = new byte[1024];
//        int result = f.read(bytes);
//        System.out.println(result);
        // 强制转换char类型
//        System.out.println(new String(bytes));

        // 第二次读文件
//        result = f.read(bytes);
//        System.out.println(result);
        // 强制转换char类型
//        System.out.println(new String(bytes));

        // 第三次读文件
//        result = f.read(bytes);
//        System.out.println(result);
        // 强制转换char类型
//        System.out.println(new String(bytes));

        // 文件读取到末尾为-1
        // 多次读文件
        int len;
        while((len = f.read(bytes)) != -1) {
//            System.out.println(len);
            System.out.print(new String(bytes,0,len));
        }

        // 释放资源
        f.close();
    }
}
