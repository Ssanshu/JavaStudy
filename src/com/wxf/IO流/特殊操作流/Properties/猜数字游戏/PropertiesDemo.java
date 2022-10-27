package com.wxf.IO流.特殊操作流.Properties.猜数字游戏;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author Ssanshu
 * @Date 2022-10-27
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        // 从文件中读取数据到Properties集合
        Properties prop = new Properties();

        // 创建集合
        FileReader reader = new FileReader("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt");
        prop.load(reader);
        reader.close();

        // 通过集合获取文件中的数据
        String count = prop.getProperty("count");
        int number = Integer.parseInt(count);

        // 判断次数
        if (number >= 3) {
            System.out.println("游戏体验结束，请充值！");
        } else {
            GuessNumber.start();
            number++;

            // 将数据从集合保存到文件中
            prop.setProperty("count", String.valueOf(number));
            FileWriter writer = new FileWriter("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt");
            prop.store(writer,null);
            writer.close();
        }
    }
}
