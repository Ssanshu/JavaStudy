package com.wxf.递归;

/**
 * @Author Ssanhu
 * @Date 2022-10-15
 */
public class DiGuiDemo {
    public static void main(String[] args) {
        int[] a = new int[20];
        a[0] = 1;
        a[1] = 1;
        for (int i = 2; i < a.length; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        System.out.println(a[19]);
        System.out.println(n(20));
    }

    public static int n(int x) {
        if (x == 1 || x == 2) {
            return 1;
        } else {
            return n(x - 1) + n(x - 2);
        }
    }
}
