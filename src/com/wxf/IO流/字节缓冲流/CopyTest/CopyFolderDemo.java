package com.wxf.IO流.字节缓冲流.CopyTest;

import java.io.*;


/**
 * @Author Ssanshu
 * @Date 2022-10-22
 */
public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        // 创建数据源目录File对象，路径是D:\\Eage下载
        File srcFold = new File("D:\\Eage下载");

        // 获取数据源目录File对象的名称（Eage下载）
        String srcFoldName = srcFold.getName();

        // 创建目的地目录File对象，路径名是模块名+Eage下载组成
        File destFold = new File("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\字节缓冲流\\CopyTest",srcFoldName);

        // 判断目的地目录对应的File是否存在，如果不存在，就创建
        if (!destFold.exists()){
            destFold.mkdir();
        }

        // 获取数据源目录下所有文件的File数据
        File[] listFiles = srcFold.listFiles();

        // 遍历数组得到每一个File对象
        for(File f : listFiles){
            // 获取数据源文件对象的名称
            String srcFileName = f.getName();

            // 创建目的地文件File对象，路径名是目的地目录+数据源文件组成
            File destFile = new File(destFold,srcFileName);

            // 复制文件
            copyFile(f,destFile);
        }

    }

    private static void copyFile(File f, File destFile) throws IOException {
        // 创建字节缓冲流对象
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(f));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destFile));

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
