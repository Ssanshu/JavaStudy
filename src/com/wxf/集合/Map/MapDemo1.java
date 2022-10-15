package com.wxf.集合.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Ssanhu
 * @Date 2022-10-11
 */
public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");

        System.out.println(map.containsKey("1")); // containsKey 查询有没有对应键
        System.out.println(map.containsKey("2"));
        System.out.println(map.containsKey("4"));
        System.out.println(map.containsValue("a")); // containsValue 查询有没有对应值
        System.out.println(map.containsValue("d"));
    }
}
