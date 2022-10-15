package com.wxf.集合.Map.Test;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author Ssanhu
 * @Date 2022-10-11
 */
public class HashMapDemo1 {
    public static void main(String[] args) {
        // 创建集合
        Map<String, Student> map = new HashMap<>();

        Student s1 = new Student("张三", "21");
        Student s2 = new Student("李四", "20");
        Student s3 = new Student("王五", "22");

        map.put("Student1", s1);
        map.put("Student2", s2);
        map.put("Student3", s3);

        // 方式一
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            Student student = map.get(key);
            System.out.println(student.getName() + "\t" + student.getAge());
        }
        System.out.println("------------");
        // 方式二
        Set<Map.Entry<String, Student>> entrySet = map.entrySet();
        for (Map.Entry<String, Student> entry : entrySet) {
            System.out.println(entry.getKey().toString() + "\t" + entry.getValue().getName() + "\t" + entry.getValue().getAge());
        }
    }
}
