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
public class ArrayListToTextDemo2 {
    public static void main(String[] args) throws IOException {

        // 创建学生对象
        Student s1 = new Student("张三", 21, "西安",1,2);
        Student s2 = new Student("李四", 22, "太原",1,2);
        Student s3 = new Student("王五", 20, "北京",1,2);

        // 创建集合
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        // 创建缓冲字符流对象
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\Bufferedfiletext.txt"));

        // 遍历集合
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            // 写
            writer.write(s.getName() + "," + s.getAge() + "," + s.getAddress());
            writer.newLine();
            // 刷新
            writer.flush();
        }

        // 释放资源
        writer.close();
    }
}
