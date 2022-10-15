package com.wxf.集合.Collections.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author Ssanhu
 * @Date 2022-10-11
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        Student s1 = new Student("zhangsan", 21);
        Student s2 = new Student("lisi", 20);
        Student s3 = new Student("wangwu", 22);
        Student s4 = new Student("zhangliu", 19);

        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        Collections.sort(array, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num1 = s1.getAge() - s2.getAge();
                int num2 = num1 == 0 ? s1.getName().compareTo(s2.getName()) : num1;
                return num2;
            }
        });
        for (Student s : array) {
            System.out.println(s.getName() + "\t" + s.getAge());
        }
    }

}
