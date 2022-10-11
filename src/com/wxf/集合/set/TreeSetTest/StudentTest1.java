package com.wxf.集合.set.TreeSetTest;

import java.util.TreeSet;

public class StudentTest1 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",20);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",20);
        Student s4 = new Student("wangwu",20);
        Student s5 = new Student("zhangliu",19);

        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

//        Iterator<Student> it = ts.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next().getName() + "\t");
//        }
        for (Student s : ts) {
            System.out.println(s.getName() + "\t" + s.getAge());
        }
    }
}
