package com.wxf.网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author Ssanshu
 * @Date 2022-11-07
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        /*
        InetAddress 此类表示Internet协议（IP）地址

        public static InetAddress getByName(String host):确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
        public String getHostName():获取此IP地址的主机名
        public String getHostAddress():返回文本显示中的IP地址字符串
         */
        InetAddress address = InetAddress.getByName("192.168.1.135");
        String hostName = address.getHostName();
        String hostAddress = address.getHostAddress();
        System.out.println("主机名:" + hostName);
        System.out.println("主机地址:" + hostAddress);
    }
}
