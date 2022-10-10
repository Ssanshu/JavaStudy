package com.wxf.Calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Ssanhu
 * @Description:
 * @Date 2022-09-06 22:27
 */
public class CalendarDemo {
    public static void main(String[] args) {

        // 获取日历类的对象
        Calendar calendar = Calendar.getInstance(); // 多态的形式
//        calendar.add(Calendar.YEAR, -4); // add方法 四年前
//        calendar.set(2018,9,15);// set方法 // 2018年9月15日
        // 四年后的4天前
        calendar.add(Calendar.YEAR, 4);
        calendar.add(Calendar.DATE, -4);
        int  year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;// get得到的月份+1是真实月份 ;
        int date = calendar.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");
    }
}
