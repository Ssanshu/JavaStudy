package com.wxf.IO流.字符缓冲流.复制练习;

import java.io.*;

/**
 * @Author Ssanshu
 * @Date 2022-10-17
 */
public class CopyJavaTest2 {
    public static void main(String[] args) throws IOException {
        // 创建缓冲字符流对象
        BufferedReader reader = new BufferedReader(new FileReader("D:\\Study\\javaBasicsStudy\\HelloWorld.java"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Study\\javaBasicsStudy\\CopyJava.java"));

        // 复制
        // reader.readLine()读取一行数据
        String len;
        while ((len = reader.readLine()) != null) {
            writer.write(len);
            writer.newLine();// 换行
            writer.flush();// 刷新
        }

        // 释放资源
        reader.close();
        writer.close();
    }
}
