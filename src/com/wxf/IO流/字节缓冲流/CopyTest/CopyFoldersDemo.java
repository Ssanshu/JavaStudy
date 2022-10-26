package com.wxf.IO流.字节缓冲流.CopyTest;

import java.io.*;

/**
 * @Author Ssanshu
 * @Date 2022-10-22
 */
public class CopyFoldersDemo {
    public static void main(String[] args) throws IOException {
        // 创建数据源File对象
        File srcFile = new File("D:\\Eage下载");

        // 创建目的地File对象
        File destFile = new File("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\字节缓冲流\\CopyTest");

        // 写方法实现文件夹的复制，参数为数据源File对象和目的地File对象
        copyFold(srcFile,destFile);
    }

    public static void copyFold(File srcFile, File destFile) throws IOException {
        // 判断数据源File是否为目录
        if (srcFile.isDirectory()) {
            //在目的地下创建和数据源File名称一样的目录
            File newFold = new File(destFile, srcFile.getName());
            if (!newFold.exists()) {
                newFold.mkdir();
            }

            // 获取数据源File下所有文件或者目录的File数组
            File[] fileArray = srcFile.listFiles();

            // 遍历File数组
            for (File file : fileArray) {
                // 把该File作为数据源File对象，递归调用文件夹的方法
                copyFold(file, newFold);
            }
        } else {
            // 文件直接复制
            File file = new File(destFile, srcFile.getName());
            copyFile(srcFile, file);
        }
    }

    private static void copyFile(File f, File destFile) throws IOException {
        // 创建字节缓冲流对象
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(f));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destFile));

        // 判断文件夹是否存在


        // 复制文件
        byte[] bytes = new byte[1024];
        int len;
        while ((len = in.read(bytes)) != -1){
            out.write(bytes,0,len);
        }

        // 释放资源
        in.close();
        out.close();
    }
}
