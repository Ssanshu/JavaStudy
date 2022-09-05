package com.wxf.Date;

import java.util.Date;

/**
 * @author Ssanhu
 * @Description:
 * @Date 2022-09-05 22:44
 */
public class DateDemo {
    public static void main(String[] args) {
        // getTime()
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime()*1.0/1000/60/60/24/365);

        // setTime()
//        long start = 1000*60*60;//Thu Jan 01 09:00:00 CST 1970
        long start = System.currentTimeMillis();//Mon Sep 05 22:49:56 CST 2022
        date.setTime(start);
        System.out.println(date);
    }
}
