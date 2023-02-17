package com.wxf.网络编程.TCP.TestDemo2;

import java.io.*;
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
        Socket s = new Socket("192.168.13.162", 12315);

        // 获取输出流，写数据,数据来源键盘输入，知道输入数据为886，发送数据结束
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 封装输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                bw.write(line);
                bw.newLine();
                bw.flush();
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        s.close();
    }
}
