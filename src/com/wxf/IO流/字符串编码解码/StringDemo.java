package com.wxf.IO流.字符串编码解码;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @Author Ssanhu
 * @Date 2022-10-16
 */
public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 定义一个字符串
        String text = "中国";

         // 编码
        // 使用平台默认字符集，默认为Utf-8
        byte[] byte1 = text.getBytes();// [-28, -72, -83, -27, -101, -67]
        System.out.println(Arrays.toString(byte1));
        // 使用GBK字符集
        byte[] byte2 = text.getBytes("GBK");// [-42, -48, -71, -6]
        System.out.println(Arrays.toString(byte2));

        // 解码
        // 使用平台默认字符集，默认为Utf-8
        String s1 = new String(byte1, "UTF-8");
        System.out.println(s1);
        // 使用GBK字符集
        String s2 = new String(byte2 , "GBK");
        System.out.println(s2);
    }
}
