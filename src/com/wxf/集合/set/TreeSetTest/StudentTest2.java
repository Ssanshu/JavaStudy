package com.wxf.集合.set.TreeSetTest;

import java.util.Comparator;
import java.util.TreeSet;

public class StudentTest2 {
    public static void main(String[] args) {
        // 创建集合
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                int num1 = s1.getAge() - s2.getAge();
                int num2 = num1 == 0 ? s1.getName().compareTo(s2.getName()) : num1;
                return num2;
            }
        });

        Student s1 = new Student("zhangsan", 20);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 20);
        Student s4 = new Student("wangwu", 20);
        Student s5 = new Student("zhangliu", 19);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for (Student s : ts) {
            System.out.println(s.getName() + "\t" + s.getAge());
        }
    }

}
