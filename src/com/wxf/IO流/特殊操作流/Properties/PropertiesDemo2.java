package com.wxf.IO流.特殊操作流.Properties;

import java.util.Properties;
import java.util.Set;

/**
 * @Author Ssanshu
 * @Date 2022-10-26
 */
public class PropertiesDemo2 {
    public static void main(String[] args) {
        // 创建集合
        Properties prop = new Properties();

        // Object setProperty(String key, String value)：设置集合的键和值，都是String类型，底层调用Hashtable方法put
        /*
        public synchronized Object setProperty(String key, String value) {
        return put(key, value);
        }
         */

        prop.setProperty("张三", "21");
        prop.setProperty("李四", "22");

        // String getProperty(String key):使用此属性列表中指定的键搜索属性
        System.out.println(prop.getProperty("张三"));

        // Set<String> stringPropertyNames():从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串
        Set<String> names = prop.stringPropertyNames();
        for (String key : names) {
            String value = prop.getProperty(key);
            System.out.println(key + "," + value);
        }
    }
}
