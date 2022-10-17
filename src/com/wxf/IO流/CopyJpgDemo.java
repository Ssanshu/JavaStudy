package com.wxf.IO流;

import java.io.*;

/**
 * @Author Ssanhu
 * @Date 2022-10-16
 */
public class CopyJpgDemo {
    public static void main(String[] args) throws IOException {

        System.out.println("共用时：" + fileRead() + "秒");
        System.out.println("共用时：" + filesRead() + "秒");
        System.out.println("共用时：" + fileBufferedRead() + "秒");
        System.out.println("共用时：" + filesBufferedRead() + "秒");
    }

    /**
     * 字节流一次读写一个字节
     * 共用时：2819秒
     */
    public static long fileRead() throws IOException {
        // 创建字节流对象
        FileInputStream fis = new FileInputStream("D:\\Eage下载\\Zero.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\Zero.jpg");

        // 记录开始时间
        long start = System.currentTimeMillis();

        // copy
        int len;
        while((len = fis.read()) != -1){
            fos.write(len);
        }
        // 释放资源
        fis.close();
        fos.close();

        // 记录结束时间
        long end = System.currentTimeMillis();
        return end - start;
    }

    /**
     * 字节流一次读写一个字节数组
     * 共用时：6秒
     */
    public static long filesRead() throws IOException {
        // 创建字节流对象
        FileInputStream fis = new FileInputStream("D:\\Eage下载\\Zero.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\Zero.jpg");

        // 记录开始时间
        long start = System.currentTimeMillis();

        // copy
        int len;
        byte[] bytes = new byte[1024];
        while((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        // 释放资源
        fis.close();
        fos.close();

        // 记录结束时间
        long end = System.currentTimeMillis();
        return end - start;
    }

    /**
     * 字节缓冲流一次读写一个字节
     * 共用时：25秒
     */
    public static long fileBufferedRead() throws IOException {
        // 创建缓冲字节流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Eage下载\\Zero.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\Zero.jpg"));

        // 记录开始时间
        long start = System.currentTimeMillis();

        // copy
        int len;
        while((len = bis.read()) != -1){
            bos.write(len);
        }
        // 释放资源
        bis.close();
        bos.close();

        // 记录结束时间
        long end = System.currentTimeMillis();
        return end - start;
    }

    /**
     * 字节缓冲流一次读写一个字节数组
     * 共用时：3秒
     */
    public static long filesBufferedRead() throws IOException {
        // 创建缓冲字符流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Eage下载\\Zero.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\Zero.jpg"));

        // 记录开始时间
        long start = System.currentTimeMillis();

        // copy
        int len;
        byte[] bytes = new byte[1024];
        while((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        // 释放资源
        bis.close();
        bos.close();

        // 记录结束时间
        long end = System.currentTimeMillis();
        return end - start;
    }
}
