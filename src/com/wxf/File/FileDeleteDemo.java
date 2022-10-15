package com.wxf.File;

import java.io.File;
import java.io.IOException;

/**
 * @Author Ssanhu
 * @Date 2022-10-15
 */
public class FileDeleteDemo {
    public static void main(String[] args) throws IOException {
        // 创建文件
//        File demoFile1 = new File("D:\\Study\\java.txt"); // 绝对路径
        File demoFile1 = new File("java.txt");// 相对路径
        System.out.println(demoFile1.createNewFile());
        // 删除文件
        System.out.println(demoFile1.delete());
        System.out.println("------------");
        // 创建目录
        File demoFile2 = new File("JavaWeb");
        System.out.println(demoFile2.mkdir());
        // 删除目录
        System.out.println(demoFile2.delete());
        System.out.println("------------");
        File demoFile3 = new File("JavaSee");
        File demoFile4 = new File("JavaSee\\Java.txt");
        System.out.println(demoFile3.mkdir());
        System.out.println(demoFile4.createNewFile());
        System.out.println("------------");
        // 文件中有内容，先删除内容在删文件
        System.out.println(demoFile4.delete());
        System.out.println(demoFile3.delete());
    }
}
