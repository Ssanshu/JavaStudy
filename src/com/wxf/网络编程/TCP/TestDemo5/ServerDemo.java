package com.wxf.网络编程.TCP.TestDemo5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author Ssanshu
 * @Date 2022-11-19
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        // 创建服务器对象Socket对象
        ServerSocket ss = new ServerSocket(12315);

        while (true) {
            // 监听客户端连接，返回一个对应的Socket对象
            Socket s = ss.accept();

            // 为每一个客户端可以一个线程
            new Thread(new ThreadServer(s)).start();
        }
    }
}
