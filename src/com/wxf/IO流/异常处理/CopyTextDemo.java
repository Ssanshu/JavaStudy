package com.wxf.IO流.异常处理;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author Ssanshu
 * @Date 2022-10-26
 */
public class CopyTextDemo {
    public static void main(String[] args) {
        menthod();
    }

    private static void menthod() {

        try (FileInputStream fis = new FileInputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt")) {
            int len;
            byte[] bytes = new byte[1024];
            while ((len = fis.read(bytes)) != -1) {
                System.out.println(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
