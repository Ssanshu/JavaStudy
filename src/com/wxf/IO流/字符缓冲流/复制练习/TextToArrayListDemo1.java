package com.wxf.IO流.字符缓冲流.复制练习;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author Ssanshu
 * @Date 2022-10-17
 */
public class TextToArrayListDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建字符缓冲流对象
        BufferedReader reader = new BufferedReader(new FileReader("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\Bufferedfiletext.txt"));

        // 创建集合对象
        ArrayList<String> arrayList = new ArrayList<String>();

        // 读
        String line;
        // reader.readLine()读取一行数据
        while ((line = reader.readLine()) != null) {
            arrayList.add(line);
        }

        // 遍历集合
        // 创建迭代器
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
