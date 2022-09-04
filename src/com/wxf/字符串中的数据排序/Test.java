package com.wxf.字符串中的数据排序;

import java.util.Arrays;

/**
 * @author Ssanhu
 * @Description:
 * @Date 2022-09-04 17:42
 */
public class Test {

    public static void main(String[] args) {
        String s = "2,7,4,1,6,5,3";
        String[] strArray = s.split("\\,");
        int[] intArray = new int[strArray.length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        Arrays.sort(intArray);
        for (int i = 0; i < intArray.length; i++) {
            if (i == intArray.length-1) {
                sb.append(intArray[i]);
            }else {
                sb.append(intArray[i]+",");
            }
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
