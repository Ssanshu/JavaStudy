package com.wxf.网络编程.UDP;

import java.io.IOException;
import java.net.*;

/**
 * @Author Ssanshu
 * @Date 2022-11-07
 */
public class SendDemo {
    /*
    UDP发送数据的步骤
        1.创建发送端的Socket对象（DatagramSocket）
        2.创建数据，并把数据打包
        3.调用DatagramSocket对象的方法发送数据
        4.关闭发送端
     */
    public static void main(String[] args) throws IOException {
        // 创建发送端的Socket对象（DatagramSocket）
        // DatagramSocket() 构造数据报套接字并将其绑定到本地主机上的任何可用端口
        DatagramSocket ds = new DatagramSocket();

        // 创建数据，并把数据打包
        // DatagramPacket(byte[] byte,int length,InetAddress address,int port)
        // 构造一个数据包，发送长度为length的数据包到指定主机上的指定端口号。
        byte[] bytes = "hello,UDP".getBytes();
        int len = bytes.length;
        InetAddress address = InetAddress.getByName("192.168.1.135");
        int port = 12315;
        DatagramPacket dp = new DatagramPacket(bytes, len, address, port);

        // 调用DatagramSocket对象的方法发送数据
        // void send （DatagramPacket p）从此套接字发送数据包
        ds.send(dp);

        // 关闭发送端
        // void close () 关闭此数据报套接字
        ds.close();
    }
}
