package com.wxf.网络编程.TCP.TestDemo2;

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
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        // 释放资源
        s.close();
        ss.close();
    }
}
