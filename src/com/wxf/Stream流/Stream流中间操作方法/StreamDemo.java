package com.wxf.Stream流.Stream流中间操作方法;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Author Ssanshu
 * @Date 2023-09-09
 */
public class StreamDemo {
    public static void main(String[] args) {

        ArrayList<Double> scores = new ArrayList<>();
        Collections.addAll(scores, 88.5, 100.0, 60.0, 99.0, 9.5, 99.6, 23.0);
        // 需求一：找出成绩大于等于60分的数据，并升序后，在输出
        scores.stream().filter(s -> s >= 60).sorted().forEach(System.out::println);


        List<Student> students = new ArrayList<>();
        Student s1 = new Student("张三", 21, 172.1);
        Student s2 = new Student("张四", 22, 171.1);
        Student s3 = new Student("张五", 20, 173.1);
        Student s4 = new Student("张六", 23, 170.1);
        Student s5 = new Student("张七", 24, 174.1);
        Student s6 = new Student("张三", 21, 172.1);
        Collections.addAll(students, s1, s2, s3, s4, s5, s6);
        // 需求二：找出年龄大于等于23，且年龄小于等于30岁的学生，并按照年龄降序输出
        students.stream().filter(s -> s.getAge() >= 23 && s.getAge() <= 30)
                .sorted((a1, a2) -> a2.getAge() - a1.getAge())
                .forEach(System.out::println);
        System.out.println("--------------------------------");

        // 需求3：取出身高最高的前3名学生，并输出
        students.stream().sorted((a1, a2) -> Double.compare(a2.getHeight(), a1.getHeight())).limit(3).forEach(System.out::println);
        System.out.println("--------------------------------");

        // 需求4：取出身高倒数的2名学生，并输出
        students.stream().sorted(Comparator.comparingDouble(Student::getHeight))
                .limit(2)
                .forEach(System.out::println);
        System.out.println("----");
        students.stream().sorted((a1, a2) -> Double.compare(a2.getHeight(), a1.getHeight()))
                .skip(students.size() - 2)
                .forEach(System.out::println);
        System.out.println("--------------------------------");

        // 需求5：找出身高超过168的学生叫什么名字，要求去除重复的名字，在输出。
        students.stream().filter(h -> h.getHeight() > 172)
                .map(Student::getName).distinct()
                .forEach(System.out::println);
        System.out.println("----");

        // distinct去重复,自定义类型的对象（希望内容一样就认为重复，重写hashCode,equals）
        students.stream().filter(h -> h.getHeight() > 172)
                .distinct()
                .forEach(System.out::println);
        System.out.println("--------------------------------");

        // 合并两个流
        Stream<Integer> i1 = Stream.of(1, 2);
        Stream<Integer> i2 = Stream.of(3, 4, 5);

        Stream<Integer> concat = Stream.concat(i1, i2);
        concat.forEach(System.out::println);
    }
}
