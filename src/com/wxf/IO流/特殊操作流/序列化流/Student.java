package com.wxf.IO流.特殊操作流.序列化流;

import java.io.Serializable;

/**
 * @Author Ssanshu
 * @Date 2022-10-26
 */
public class Student implements Serializable {

    private String name;

    private transient int  age;

    private static final long serialVersionUID = 1L;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
