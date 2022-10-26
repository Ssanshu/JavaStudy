package com.wxf.IO流.特殊操作流.打印流.复制练习;

import java.io.*;

/**
 * @Author Ssanshu
 * @Date 2022-10-17
 */
public class CopyJavaTest1 {
    public static void main(String[] args) throws IOException {
        // 创建缓冲字符流对象
        BufferedReader reader = new BufferedReader(new FileReader("D:\\Study\\javaBasicsStudy\\HelloWorld.java"));
        // 打印流
        PrintWriter writer = new PrintWriter(new FileWriter("D:\\Study\\javaBasicsStudy\\CopyJava.java"), true);

        // 复制
        String len;
        while ((len = reader.readLine()) != null) {
            writer.println(len);
        }

        // 释放资源
        reader.close();
        writer.close();
    }
}
