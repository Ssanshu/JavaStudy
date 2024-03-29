package com.wxf.网络编程.TCP.TestDemo1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author Ssanshu
 * @Date 2022-11-19
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象（Socket）
        //Socket (InetAddress address,int port) 创建流套接字并将其连接到指定IP地址的指定端口号
        //Socket s = new Socket(InetAddress.getByName("192.168.1.148"),12315);
        // Socket (String host,int port)创建流套接字并将其连接到指定主机上的指定端口号
        Socket s = new Socket("192.168.13.162",12315);

        // 获取输出流，写数据
        // OutputStream getOutputStream()返回此套接字的输出流
        OutputStream os = s.getOutputStream();
        os.write("Hello".getBytes());

        // 接收服务器反馈
        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String data = new String(bytes,0,len);
        System.out.println("数据：" + data);

        //释放资源
        s.close();
    }
}
