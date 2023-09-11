package com.wxf.Java高级.注解.注解应用.模拟Junit框架;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author Ssanshu
 * @Date 2023-09-11
 */
public class AnnotationTest {
    @MyTest
    public void test1() {
        System.out.println("-------test1--------");
    }

    public void test2() {
        System.out.println("-------test2--------");
    }

    public void test3() {
        System.out.println("-------test3--------");
    }

    @MyTest
    public void test4() {
        System.out.println("-------test4--------");
    }

    public static void main(String[] args) throws Exception {
        AnnotationTest a = new AnnotationTest();
        Class c = AnnotationTest.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)) {
                method.invoke(a);
            }
        }
    }
}
