package com.wxf.Calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {

        // 获取一年的二月有多少天
        Scanner sc = new Scanner(System.in);
        System.out.println("年份：");
        int year = sc.nextInt();

        // 设置日历对象的年、月、日
        Calendar cal = Calendar.getInstance();
        cal.set(year,2,1);
//        System.out.println(cal.get(Calendar.MONTH) + 1);
        // 3月1日往前推一天，就是2月的最后一天
        cal.add(Calendar.DATE,-1);

        // 获取这一天输出
        int date = cal.get(Calendar.DATE);
        System.out.println(date);
    }
}
