package com.wxf.IO流.特殊操作流.Properties.猜数字游戏;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author Ssanshu
 * @Date 2022-10-27
 */
public class GuessNumber {
    public GuessNumber() {
    }

    public static void start(){
        Random r = new Random();
        int num = r.nextInt(100) + 1;

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入数字：");
            int guessNum = sc.nextInt();

            if (num < guessNum) {
                System.out.println("大了!");
            } else if (num > guessNum) {
                System.out.println("小了!");
            } else {
                System.out.println("中了");
                break;
            }
        }
    }
}
