package com.wxf.IO流.特殊操作流.Properties;

import java.util.Properties;
import java.util.Set;

/**
 * @Author Ssanshu
 * @Date 2022-10-26
 */
public class PropertiesDemo1 {
    public static void main(String[] args) {
        // Properties作为Map集合的使用
        // 创建集合对象
        Properties prop = new Properties();

        prop.put("张三", "21");
        prop.put("李四", "22");
        prop.put("王五", "24");

        // 遍历集合
        Set<Object> keySet = prop.keySet();
        for (Object key : keySet) {
            Object value = prop.get(key);
            System.out.println(key + "," + value);
        }
    }
}
