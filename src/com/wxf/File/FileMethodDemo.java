package com.wxf.File;

import java.io.File;

/**
 * @Author Ssanhu
 * @Date 2022-10-15
 */
public class FileMethodDemo {
    public static void main(String[] args) {
        File file = new File("日常笔记.md");
        System.out.println(file.isDirectory());// 测试此抽象路径名表示的File是否为目录
        System.out.println(file.isFile());// 测试此抽象路径名表示的File是否为文件
        System.out.println(file.exists());// 测试此抽象路径名表示的File是否为存在
        System.out.println(file.getAbsoluteFile());// 返回此抽象路径名的绝对路径名字符串
        System.out.println(file.getPath());// 将此抽象路径名转换为路径名字符串
        System.out.println(file.getName());// 返回由此抽象路径名表示的文件或目录的名称

        System.out.println("--------------------------------");

        File file2 = new File("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\File\\CreatFileTest");
        String[] StringFiles = file2.list();// 返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
        for (String filename : StringFiles) {
            System.out.println(filename);
        }

        System.out.println("--------------------------------");

        File[] files = file2.listFiles();// 返回此抽象路径名表示的目录中的文件和目录的File对象数组

        for (File f : files){
//            System.out.println(f);
            if (f.isFile()){
                System.out.println(f.getName());
            }
        }
    }
}
