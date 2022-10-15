package com.wxf.递归;

import java.util.Scanner;

/**
 * @Author Ssanhu
 * @Date 2022-10-15
 */
public class JCDiguiDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数字：");
        int i = sc.nextInt();
        System.out.println(sum(i));
    }

    //阶乘递归实现
    public static int sum(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * sum(x - 1);
        }
    }
}
