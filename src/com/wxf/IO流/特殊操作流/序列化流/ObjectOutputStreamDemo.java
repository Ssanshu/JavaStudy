package com.wxf.IO流.特殊操作流.序列化流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @Author Ssanshu
 * @Date 2022-10-26
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        // java.io.NotSerializableException 需要序列化的类实现Serializable接口
        // 构造方法
        // ObjectOutputStream (OutputStream out): 创建一个指定的OutputStream的ObjectOutputStream
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt"));

        // 创建对象
        Student student = new Student("张三",21);

        // void writeObject (Object obj):将指定的对象写入ObjectOutputStream
        // 序列化对象的方法
        objectOutputStream.writeObject(student);

        // 释放资源
        objectOutputStream.close();

    }
}
