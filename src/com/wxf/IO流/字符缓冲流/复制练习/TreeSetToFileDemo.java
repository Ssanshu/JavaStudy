package com.wxf.IO流.字符缓冲流.复制练习;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author Ssanshu
 * @Date 2022-10-17
 */
public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
        // 创建TreeSet集合
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // 主要条件
                int num1 = s2.sum() - s1.sum();
                // 次要条件
                int num2 = num1 == 0 ? s1.getMath() - s2.getMath() : num1;
                int num3 = num2 == 0 ? s1.getChinese() - s2.getChinese() : num2;
                int num4 = num3 == 0 ? s1.getName().compareTo(s2.getName()) : num3;
                return num4;
            }
        });

        // 创建学生对象
        Student s1 = new Student("zhangsan", 21, "西安", 78, 88);
        Student s2 = new Student("lisi", 21, "西安", 88, 79);
        Student s3 = new Student("wangwu", 21, "西安", 73, 82);
        Student s4 = new Student("zhangliu", 21, "西安", 75, 85);
        Student s5 = new Student("qinqi", 21, "西安", 75, 91);

        // 添加学生对象
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        // 创建缓冲字符流对象
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\Bufferedfiletext.txt"));

        //遍历集合
        for (Student s : ts) {
            System.out.println(s.getName() + "\t" + s.sum());
            writer.write(s.getName() + "," + s.sum());
            writer.newLine();
            writer.flush();
        }

        // 释放资源
        writer.close();

    }
}
