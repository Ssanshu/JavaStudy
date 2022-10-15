package com.wxf.File;

import java.io.File;

/**
 * @Author Ssanhu
 * @Date 2022-10-15
 */
public class FileDemo {
    public static void main(String[] args) {

        // File(String pathname): 通过将给定的路径名字符串转换为抽象路径名来创建新的File实例
        File file = new File("D:\\Test\\Test.txt");
        System.out.println(file);

        // File(String pathname, String child): 从父路径名字符串和子路径名字符串创建新的 File实例
        File file1 = new File("D:\\Test","Test.txt");
        System.out.println(file1);

        // File(File parent, String child): 从父抽象路径名和子路径名字符串创建新的 File实例
        File file2 = new File("D:\\Test");
        File file3 = new File(file2,"Test.txt");
        System.out.println(file3);
    }
}
