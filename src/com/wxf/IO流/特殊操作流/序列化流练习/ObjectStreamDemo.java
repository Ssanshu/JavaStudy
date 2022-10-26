package com.wxf.IO流.特殊操作流.序列化流练习;

import com.wxf.IO流.特殊操作流.序列化流.Student;

import java.io.*;

/**
 * @Author Ssanshu
 * @Date 2022-10-26
 */
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // InvalidClassException异常解决:给对象所属的类加一个serialVersionUID
//            private static final long serialVersionUID = 1L;
//        write();
        read();
    }

    /* java.io.InvalidClassException:

     com.wxf.IO流.特殊操作流.序列化流.Student; local class incompatible:
     stream classdesc serialVersionUID = -3375830972390219146, local class serialVersionUID = -6213650508443730770
     */
    // 序列化
    public static void write() throws IOException {
        // java.io.NotSerializableException 需要序列化的类实现Serializable接口
        // 构造方法
        // ObjectOutputStream (OutputStream out): 创建一个指定的OutputStream的ObjectOutputStream
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt"));

        // 创建对象
        Student student = new Student("张三", 21);

        // void writeObject (Object obj):将指定的对象写入ObjectOutputStream
        // 序列化对象的方法
        objectOutputStream.writeObject(student);

        // 释放资源
        objectOutputStream.close();

    }

    // 反序列化
    public static void read() throws IOException, ClassNotFoundException {
        // 构造方法
        // ObjectInputStream (InputStream in):创建从指定的InputStream读取的ObjectInputStream
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt"));

        // Object readObject(): 从ObjectInputStream读取一个对象
        Object obj = in.readObject();
        Student student = (Student) obj;
        System.out.println(student.getName() + "," + student.getAge());

        // 释放资源
        in.close();
    }
}
