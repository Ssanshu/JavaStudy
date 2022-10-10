package com.wxf.集合.set;

import java.util.HashSet;

public class StudentTest {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<Student>();
        Student s1 = new Student("张三","21");
        Student s2 = new Student("李四","22");
        Student s3 = new Student("王五","23");

        Student s4 = new Student("张三","21");

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        for (Student s : students) {
            System.out.println("姓名：" + s.getName() + "\t" + "年龄：" + s.getAge());
        }
    }
}
