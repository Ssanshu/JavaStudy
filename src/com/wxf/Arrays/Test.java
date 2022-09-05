package com.wxf.Arrays;

import java.util.Arrays;

/**
 * @author Ssanhu
 * @Description:
 * @Date 2022-09-05 22:31
 */
public class Test {

    public static void main(String[] args) {
        String[] array = { "2", "1", "5", "4", "3", "6", "7", "8", "9"};
        System.out.println(Arrays.toString(array));//toString 以字符串输出数组内容
        Arrays.sort(array);// sort 排序
        System.out.println(Arrays.toString(array));
    }


}
