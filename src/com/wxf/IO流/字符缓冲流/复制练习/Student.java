package com.wxf.IO流.字符缓冲流.复制练习;

import java.util.Comparator;
import java.util.Objects;

/**
 * @Author Ssanshu
 * @Date 2022-10-17
 */
public class Student {

    private String name;
    private int age;
    private String address;

    private int math;
    private int chinese;

    public Student() {
    }

    public Student(String name, int age, String address, int math, int chinese) {
        this.name = name;
        this.math = math;
        this.chinese = chinese;
    }

//    @Override
//    public int compareTo(Student s) {
//        int num1 = s.sum() - this.sum();
//        int num2 = num1 == 0 ? this.math - s.math : num1;
//        int num3 = num2 == 0 ? this.chinese - s.chinese : num2;
//        int num4 = num3 == 0 ? this.name.compareTo(s.name) : num3;
//        return num4;
//    }

    public int sum() {
        int sum = math + chinese;
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (math != student.math) return false;
        if (chinese != student.chinese) return false;
        if (!Objects.equals(name, student.name)) return false;
        return Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + math;
        result = 31 * result + chinese;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", math=" + math +
                ", chinese=" + chinese +
                '}';
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

}
