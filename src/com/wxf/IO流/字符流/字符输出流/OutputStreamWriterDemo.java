package com.wxf.IO流.字符流.字符输出流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @Author Ssanshu
 * @Date 2022-10-17
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        // 创建一个字符对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt"));

        // 写数据
        char[] chars = {'a','b','c','d','e'};
        osw.write(chars);
        osw.write("\r\n");
        osw.write(chars,0,chars.length);
        osw.write("\r\n");
        osw.write("abcdefg");
        osw.write("\r\n");
        osw.write("abcdefg",2,5);
        // 刷新
        osw.flush();

        // 释放资源
        osw.close();

    }
}
