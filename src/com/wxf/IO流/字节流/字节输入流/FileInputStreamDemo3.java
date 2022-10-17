package com.wxf.IO流.字节流.字节输入流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author Ssanhu
 * @Date 2022-10-16
 */
public class FileInputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        // 创建字节流对象
        // 输入
        FileInputStream fis = new FileInputStream("D:\\Eage下载\\猫语霞.jpg");
        // 输出
        FileOutputStream fos = new FileOutputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\猫语霞.jpg");

        //读写数据，复制图片
        byte[] bytes = new byte[1024];
        int len;
        while((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }

        // 释放资源
        fis.close();
        fos.close();
    }
}
