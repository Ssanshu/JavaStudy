package com.wxf.集合.set.TreeSetTest;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private Integer age;

    public Student() {}

    public Student(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Student student = (Student) o;

        if (!Objects.equals(name, student.name)) {
            return false;
        }
        return Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Student s) {
//        return 1;
        int num1 = this.age - s.age;
        int num2 = num1==0?this.name.compareTo(s.name):num1;
//        int num2 = 0;
//        if (num1==0) {
//            int num = this.name.compareTo(s.name);
//            if (num !=0 ) {
//                num2 = num;
//            }else {
//                num2 = num1;
//            }
//        }else {
//            num2 = num1;
//        }
        return num2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
