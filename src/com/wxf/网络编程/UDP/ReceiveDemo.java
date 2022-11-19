package com.wxf.网络编程.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @Author Ssanshu
 * @Date 2022-11-07
 */
public class ReceiveDemo {
    /*
    UDP接收数据的步骤
        1.创建接收端的Socket对象（DatagramSocket）
        2.创建一个数据包，用于接收数据
        3.调用DatagramSocket对象的方法接收数据
        4.解析数据包，并把数据在控制台显示
        5.关闭接收端
     */
    public static void main(String[] args) throws IOException {
        // 创建接收端的Socket对象（DatagramSocket）
        // DatagramSocket(int port) 构造数据报套接字并将其绑定到本地主机上的指定端口
        DatagramSocket socket = new DatagramSocket(12315);

        // 创建一个数据包，用于接收数据
        // DatagramPacket(byte[] byte,int length)构造一个 DatagramPacket用于接收长度为length数据包
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);

        // 调用DatagramSocket对象的方法接收数据
        socket.receive(dp);

        // 解析数据包，并把数据在控制台显示
        byte[] data = dp.getData();
        //int getLength() 返回要发送的数据的长度或接收到的数据的长度
        int len = dp.getLength();
        String datas = new String(data,0,len);
        System.out.println(datas);
        // 关闭接收端C
        socket.close();
    }
}
