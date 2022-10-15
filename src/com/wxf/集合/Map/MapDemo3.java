package com.wxf.集合.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author Ssanhu
 * @Date 2022-10-11
 */
public class MapDemo3 {
    public static void main(String[] args) {
        // 创建集合对象
        Map<String,String> map = new HashMap<>();

        map.put("1","a");
        map.put("2","b");
        map.put("3","c");

        // 获取所有键值对对象的集合
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String,String> entry : entries){
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
}
