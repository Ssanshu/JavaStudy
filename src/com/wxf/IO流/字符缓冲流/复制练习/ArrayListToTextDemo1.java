package com.wxf.IO流.字符缓冲流.复制练习;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author Ssanshu
 * @Date 2022-10-17
 */
public class ArrayListToTextDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建集合
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("Java");

        // 创建缓冲字符流对象
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\Bufferedfiletext.txt"));

        // 遍历集合
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String text = iterator.next();
            // 写
            writer.write(text);
            writer.newLine();
            // 刷新
            writer.flush();
        }

        // 释放资源
        writer.close();
    }
}
