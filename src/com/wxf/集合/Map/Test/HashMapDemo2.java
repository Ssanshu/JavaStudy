package com.wxf.集合.Map.Test;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author Ssanhu
 * @Date 2022-10-11
 */
public class HashMapDemo2 {
    public static void main(String[] args) {
        // 创建集合
        Map<Student, String> map = new HashMap<>();

        Student s1 = new Student("张三", "21");
        Student s2 = new Student("李四", "20");
        Student s3 = new Student("王五", "22");
        Student s4 = new Student("王五", "22");

        map.put(s1,"北京");
        map.put(s2,"上海");
        map.put(s3,"武汉");
        map.put(s4,"成都");

        Set<Student> keySet = map.keySet();
        for (Student key : keySet) {
            String value = map.get(key);
            System.out.println(key.getName() + "\t" + key.getAge() + "\t" + value);
        }

    }
}
