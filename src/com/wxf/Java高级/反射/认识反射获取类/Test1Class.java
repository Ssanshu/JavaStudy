package com.wxf.Java高级.反射.认识反射获取类;

/**
 * @Author Ssanshu
 * @Date 2023-09-09
 */
public class Test1Class {
    public static void main(String[] args) throws Exception {
        Class c1 = Student.class;
        String c1Name = c1.getName();// 全类名
        String simpleName = c1.getSimpleName();// 简名
        System.out.println(c1Name);
        System.out.println(simpleName);

        Class c2 = Class.forName("com.wxf.Java高级.反射.认识反射获取类.Student");
        System.out.println(c1 == c2);

        Student s = new Student();
        Class c3 = s.getClass();
        System.out.println(c3 == c1);
    }
}
