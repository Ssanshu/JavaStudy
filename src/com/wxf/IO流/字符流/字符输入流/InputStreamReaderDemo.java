package com.wxf.IO流.字符流.字符输入流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author Ssanshu
 * @Date 2022-10-17
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        // 创界一个字符对象
        InputStreamReader reader = new InputStreamReader(new FileInputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt"));

        // 一次读一个字符数据
        int len;
//        while ((len = reader.read()) != -1){
//            System.out.println((char) len);
//        }

        // 一次读一个字符数组数据
        char[] chars = new char[1024];
        while ((len = reader.read(chars))!= -1) {
            System.out.print(new String(chars, 0, len));
        }

        // 释放资源
        reader.close();
    }
}
