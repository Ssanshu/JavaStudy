package com.wxf.Math;

/**
 * @author Ssanhu
 * @Description:
 * @Date 2022-09-04 16:03
 */
public class Test {
    public static void main(String[] args) {
        // 绝对值
        System.out.println(Math.abs(12));
        System.out.println(Math.abs(-12));
        System.out.println("================================================");
        // 返回大于或等于参数的最小double值，等于一个整数
        System.out.println(Math.ceil(12.36));
        System.out.println(Math.ceil(12.55));
        System.out.println("================================================");
        // 返回小于或等于参数的最小double值，等于一个整数
        System.out.println(Math.floor(12.36));
        System.out.println(Math.floor(12.55));
        System.out.println("================================================");
        // 按照四舍五入返回最接近参数的int
        System.out.println(Math.round(12.36F));
        System.out.println(Math.round(12.55F));
        System.out.println("================================================");
        // 返回两个int中的最大值
        System.out.println(Math.max(12,15));
        System.out.println(Math.max(12,8));
        System.out.println("================================================");
        // 返回两个int中的最小值
        System.out.println(Math.min(12,15));
        System.out.println(Math.min(12,8));
        System.out.println("================================================");
        // 返回a的b次幂的值
        System.out.println(Math.pow(2.0,2));
        System.out.println(Math.pow(2.5,3));
        System.out.println("================================================");
        // 返回值为double的正值[0.0,1.0)随机值
        System.out.println(Math.random());
        System.out.println("================================================");
    }
}
