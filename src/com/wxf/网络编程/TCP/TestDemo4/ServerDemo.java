package com.wxf.网络编程.TCP.TestDemo4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author Ssanshu
 * @Date 2022-11-19
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        // 创建服务器端的Socket对象（ServerSocket)
        // ServerSocket (int port) 创建绑定到指定端口的服务器套接字
        ServerSocket ss = new ServerSocket(12315);

        // Socket accept（）侦听要连接到此套接字并接受它
        Socket s = ss.accept();

        // 获取输入流，读数据，并把数据显示在控制台
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        // 把数据写入文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\IO流\\IOTest\\filetext.txt"));
        String line;
        while ((line = br.readLine()) != null) {
//            if ("886".equals(line)) {
//                break;
//            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

//        System.out.println("222");

        // 做出反馈
        BufferedWriter bwWriter = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwWriter.write("文件上传成功！");
        bwWriter.newLine();
        bwWriter.flush();

        // 释放资源
        bw.close();
        ss.close();
    }
}
