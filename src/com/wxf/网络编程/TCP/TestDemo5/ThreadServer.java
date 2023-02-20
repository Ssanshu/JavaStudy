package com.wxf.网络编程.TCP.TestDemo5;

import java.io.*;
import java.net.Socket;

/**
 * @Author Ssanshu
 * @Date 2023-02-20
 */
public class ThreadServer implements Runnable {

    private Socket s;

    public ThreadServer(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            // 接收数据写到文本文件
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt"));
            // 解决名称冲突问题
            int num = 0;
            File file = new File("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext[" + num + "].txt");
            // num++
            while (file.exists()) {
                num++;
                file = new File("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext[" + num + "].txt");
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            // 给出反馈
            BufferedWriter bwWriter = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwWriter.write("文件传输成功");
            bwWriter.newLine();
            bwWriter.flush();

            // 释放资源
            s.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
