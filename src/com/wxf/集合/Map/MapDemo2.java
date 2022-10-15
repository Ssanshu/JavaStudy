package com.wxf.集合.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author Ssanhu
 * @Date 2022-10-11
 */
public class MapDemo2 {
    public static void main(String[] args) {
        // 创建集合对象
        Map<String,String> map = new HashMap<>();

        map.put("1","a");
        map.put("2","b");
        map.put("3","c");

//        System.out.println(map.get("1"));
//        System.out.println(map.get("4"));

        Set<String> keySet = map.keySet();
        for (String key : keySet) { // 遍历
//            System.out.println(key);
            String value = map.get(key);
            System.out.println(key + value);
        }

        System.out.println("--------------------------------");

        Collection<String> values = map.values();
        for (Object value : values) {
            System.out.println(value);
        }
    }
}
