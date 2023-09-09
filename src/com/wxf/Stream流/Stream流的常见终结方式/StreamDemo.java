package com.wxf.Stream流.Stream流的常见终结方式;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author Ssanshu
 * @Date 2023-09-09
 */
public class StreamDemo {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Student s1 = new Student("张三", 21, 172.1);
        Student s2 = new Student("张四", 22, 171.1);
        Student s3 = new Student("张五", 20, 173.1);
        Student s4 = new Student("张六", 23, 170.1);
        Student s5 = new Student("张七", 24, 174.1);
        Student s6 = new Student("张三", 21, 172.1);
        Collections.addAll(students, s1, s2, s3, s4, s5, s6);
        // 需求1：清计算出身高超过172的学生有几人
        long count = students.stream().filter(s -> s.getHeight() > 172).count();
        System.out.println(count);
        System.out.println("--------------------------------");

        // 需求2：请找出身高最高的学生对象，并输出
        Student sMax = students.stream().max(Comparator.comparingDouble(Student::getHeight)).get();
        System.out.println(sMax);
        System.out.println("--------------------------------");

        // 需求3：请找出身高最矮的学生对象，并输出
        Student sMin = students.stream().min(Comparator.comparingDouble(Student::getHeight)).get();
        System.out.println(sMin);
        System.out.println("--------------------------------");

        // 需求4：找出身高超过172的学生对象，并放到一个新集合中区返回。
        // 流只能收集一次 stream has already been operated upon or closed
//        Stream<Student> studentStream = students.stream().filter(s -> s.getHeight() > 172);
        List<Student> listCollect = students.stream().filter(s -> s.getHeight() > 172).collect(Collectors.toList());
//        List<Student> listCollect = studentStream.collect(Collectors.toList());
        System.out.println(listCollect);

        Set<Student> setCollect = students.stream().filter(s -> s.getHeight() > 172).collect(Collectors.toSet());
//        Set<Student> setCollect = studentStream.collect(Collectors.toSet());
        System.out.println(setCollect);
        System.out.println("--------------------------------");

        // 需求5：找出身高超过170的学生对象，并把学生对象的名字和身高，存入到一个Map集合返回
        Map<String, Double> mapCollect = students.stream().filter(s -> s.getHeight() > 172)
                .distinct()
                .collect(Collectors.toMap(Student::getName, Student::getHeight));
        System.out.println(mapCollect);
        System.out.println("--------------------------------");

        // 需求6：找出身高超过170的学生对象，并把学生对象的名字和身高，存入到一个数组中返回
        Object[] array = students.stream().filter(s -> s.getHeight() > 172).toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("--------------------------------");

        // 需求7：找出身高超过170的学生对象，并把学生对象的名字和身高，存入到一个学生类型数组中返回
        Student[] studentsArray = students.stream().filter(s -> s.getHeight() > 172).toArray(Student[]::new);
        System.out.println(Arrays.toString(studentsArray));
    }
}
