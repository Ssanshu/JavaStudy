package com.wxf.集合.Map.统计字符串字母;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * @Author Ssanhu
 * @Date 2022-10-11
 */
public class Test {
    public static void main(String[] args) {
        // 从键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String line = sc.nextLine();

        // Character键（char包装类）
        TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

        for (int i = 0; i < line.length(); i++) {
            char key = line.charAt(i); // charAt()方法返回指定索引位置的char值。
            // 拿到每一个字符作为键到TreeMap集合中去找对应的值
            Integer value = tm.get(key);

            if (value == null) {
                tm.put(key, 1);
            } else {
                value++;
                tm.put(key, value);
            }
        }
        StringBuilder sb = new StringBuilder();
        Set<Character> keySet = tm.keySet();
        for (Character key : keySet) {
            Integer value = tm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
