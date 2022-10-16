package com.wxf.IO流;

import java.io.*;

/**
 * @Author Ssanhu
 * @Date 2022-10-16
 */
public class CopyTextDemo {
    public static void main(String[] args) throws IOException {
        // 创建输入字节流对象
        FileInputStream fis = new FileInputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt");
        // 创建输出流字节对象
        FileOutputStream fos = new FileOutputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\copyfiletext.txt");

        // 读写操作
        int result;
        while((result = fis.read()) != -1) {
            fos.write(result);
        }

        // 释放资源
        fis.close();
        fos.close();
    }
}
