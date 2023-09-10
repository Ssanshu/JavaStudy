package com.wxf.Java高级.反射.获取类的成员方法;

/**
 * @Author Ssanshu
 * @Date 2023-09-10
 */
public class Cat {
    private String name;
    private int age;

    public Cat() {
        System.out.println("无参数构造器");
    }

    private Cat(String name, int age) {
        System.out.println("有参数构造器");
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
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private void run() {
        System.out.println("猫跑");
    }

    public void eat() {
        System.out.println("猫吃");
    }

    private String eat(String name) {
        return "吃" + name;
    }
}
