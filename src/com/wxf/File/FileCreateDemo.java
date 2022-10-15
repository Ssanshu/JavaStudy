package com.wxf.File;

import java.io.File;
import java.io.IOException;

/**
 * @Author Ssanhu
 * @Date 2022-10-15
 */
public class FileCreateDemo {
    public static void main(String[] args) throws IOException {
        // 创建一个新的文件
        File file = new File("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\File\\CreatFileTest\\Test.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
        // 创建一个新的目录
        File file1 = new File("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\File\\CreatFileTest\\JavaWeb");
        System.out.println(file1.mkdir());
        // 创建多级新的目录
        File file2 = new File("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\File\\CreatFileTest\\JavaSe\\javaWeb");
        System.out.println(file2.mkdirs());
    }
}
