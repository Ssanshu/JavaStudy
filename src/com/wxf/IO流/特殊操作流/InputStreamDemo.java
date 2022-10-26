package com.wxf.IO流.特殊操作流;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @Author Ssanshu
 * @Date 2022-10-26
 */
public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
//        // 标准输入流
//        InputStream in = System.in;
//
//        // 字节流转换字符流
//        InputStreamReader reader = new InputStreamReader(in);
//
//        // 字符流转字符缓冲流
//        BufferedReader bufferedReader = new BufferedReader(reader);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入字符串");
        String s = bufferedReader.readLine();
        System.out.println(s);
        // 输入一个整数
        System.out.println("请输入一个整数");
        int i = Integer.parseInt(bufferedReader.readLine());
        System.out.println(i);
    }
}
