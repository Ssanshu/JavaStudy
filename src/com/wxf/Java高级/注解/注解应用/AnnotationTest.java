package com.wxf.Java高级.注解.注解应用;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author Ssanshu
 * @Date 2023-09-11
 */
public class AnnotationTest {
    @Test
    public void parseClass(){
        //先得到Class对象
        Class c = Demo.class;
        //解析注解
        //判断是否存在某个注解
        if (c.isAnnotationPresent(MyTest.class)){
             MyTest myTest = (MyTest) c.getDeclaredAnnotation(MyTest.class);
            System.out.println(myTest.value());
            System.out.println(myTest.aaa());
            System.out.println(Arrays.toString(myTest.bbb()));
        }
    }

    @Test
    public void parseMethod() throws Exception {
        //先得到Class对象
        Class c = Demo.class;
        //获取注解
        Method m = c.getDeclaredMethod("test");

        //判断是否存在某个注解
        if (m.isAnnotationPresent(MyTest.class)){
            MyTest myTest = m.getDeclaredAnnotation(MyTest.class);
            System.out.println(myTest.value());
            System.out.println(myTest.aaa());
            System.out.println(Arrays.toString(myTest.bbb()));
        }
    }
}
