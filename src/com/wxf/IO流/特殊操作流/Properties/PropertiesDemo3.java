package com.wxf.IO流.特殊操作流.Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author Ssanshu
 * @Date 2022-10-27
 */
public class PropertiesDemo3 {
    public static void main(String[] args) throws IOException {
        // 把集合中的数据保存到文件
        myStore();

        // 把文件中的数据加载到集合
        myLoad();
    }

    private static void myLoad() throws IOException {
        // 创建输入字符流对象
        FileReader reader = new FileReader("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt");

        // 创建集合
        Properties prop = new Properties();

        // 导入数据
        // void load(Reader reader)
        prop.load(reader);
        System.out.println(prop);
    }

    private static void myStore() throws IOException {
        // 创建集合
        Properties prop = new Properties();

        // 导入数据
        prop.put("01","张三");
        prop.put("02","李四");
        prop.put("03","王五");

        // 创建输出字符流对象
        FileWriter writer = new FileWriter("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt");

        // 传递数据
        // void store(Writer writer, String comments)
        prop.store(writer,null);

        // 释放资源
        writer.close();
    }
}
