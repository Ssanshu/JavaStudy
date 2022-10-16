package com.wxf.IO流.字节缓冲流;

import java.io.*;

/**
 * @Author Ssanhu
 * @Date 2022-10-16
 */
public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {

        // 字节缓冲输出流：BufferedOutputStream (OutputStream Out)
//        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\Bufferedfiletext.txt"));

        // 写数据
//        out.write("Hello".getBytes());
//        out.write("\r\n".getBytes());
//        out.write("world".getBytes());
//        out.write("\r\n".getBytes());
        // 释放资源
//        out.close();

        // 字节缓冲输入流：BufferedInputStream (InputStream in)
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\Bufferedfiletext.txt"));

        // 读数据 一次读一个字节数据
//        int len;
//        while ((len = in.read()) != -1) {
//            System.out.print((char)len);
//        }
        // 读数据 一次读一个自己数组数据
        byte[] bytes = new byte[1024];
        int len;
        while ((len = in.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

        //释放资源
        in.close();
    }
}
