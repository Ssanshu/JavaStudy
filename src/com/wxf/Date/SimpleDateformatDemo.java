package com.wxf.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Ssanhu
 * @Description:
 * @Date 2022-09-05 22:58
 */
public class SimpleDateformatDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        // 从Date 转换到 String
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(s.format(date));

        // 从String 转换到 Date
        SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String ss = "2022-09-05 23:01:07";
        System.out.println(s2.parse(ss));
    }
}
