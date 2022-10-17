package com.wxf.IO流.字符缓冲流.复制练习;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

/**
 * @Author Ssanshu
 * @Date 2022-10-17
 */
public class CallNameDemo {
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

        // 1.创建随机索引
        Random random = new Random();
        int index = random.nextInt(arrayList.size());

        // 2.shuffle打乱集合取第一个索引的值
//        Collections.shuffle(arrayList);
//        index = 0;
//        System.out.println(arrayList.get(index));

        System.out.println(arrayList.get(index));
    }
}
