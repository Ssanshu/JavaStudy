package com.wxf.异常;

import java.util.Scanner;

public class NumTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字");
        int num = scanner.nextInt();

        Num number = new Num();
        try {
            number.numCheck(num);
        } catch (NumException e) {
            throw new RuntimeException(e);
        }
    }
}
