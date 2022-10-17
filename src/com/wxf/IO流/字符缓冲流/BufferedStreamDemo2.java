package com.wxf.IO流.字符缓冲流;

import java.io.*;

/**
 * @Author Ssanshu
 * @Date 2022-10-17
 */
public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 创建缓冲字符输出流对象
//        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt"));
          BufferedReader reader = new BufferedReader(new FileReader("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt"));

        // 写
//        for (int i = 0; i < 10; i++) {
//            writer.write("hello world!");
//            writer.newLine();// 转行
//            writer.flush();// 刷新
//        }

        // 读
        String line;
        // reader.readLine()读取一行，不包括任何终止字符
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        // 释放资源
//        writer.close();
        reader.close();
    }
}
