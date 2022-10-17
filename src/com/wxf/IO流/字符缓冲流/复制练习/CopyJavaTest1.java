package com.wxf.IO流.字符缓冲流.复制练习;

import java.io.*;

/**
 * @Author Ssanshu
 * @Date 2022-10-17
 */
public class CopyJavaTest1 {
    public static void main(String[] args) throws IOException {
        // 创建缓冲字符流对象
        BufferedReader reader = new BufferedReader(new FileReader("D:\\Study\\javaBasicsStudy\\HelloWorld.java"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Study\\javaBasicsStudy\\CopyJava.java"));

        // 复制
        int len;
        char[] chars = new char[1024];
        while ((len = reader.read(chars)) != -1) {
            writer.write(chars, 0, len);
        }

        // 释放资源
        reader.close();
        writer.close();
    }
}
