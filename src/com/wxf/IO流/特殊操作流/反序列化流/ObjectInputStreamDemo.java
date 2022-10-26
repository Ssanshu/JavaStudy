package com.wxf.IO流.特殊操作流.反序列化流;

import com.wxf.IO流.特殊操作流.序列化流.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Author Ssanshu
 * @Date 2022-10-26
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 构造方法
        // ObjectInputStream (InputStream in):创建从指定的InputStream读取的ObjectInputStream
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt"));

        // Object readObject(): 从ObjectInputStream读取一个对象
        Object obj = in.readObject();
        Student student = (Student) obj;
        System.out.println(student.getName());

        // 释放资源
        in.close();
    }
}
