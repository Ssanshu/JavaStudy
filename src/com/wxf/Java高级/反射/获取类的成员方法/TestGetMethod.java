package com.wxf.Java高级.反射.获取类的成员方法;

/**
 * @Author Ssanshu
 * @Date 2023-09-10
 */

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * 目标：掌握获取类的成员方法，并对其进行操作。
 */
public class TestGetMethod {
    @Test
    public void testGetMethods() {
        //1.反射第一步：先得到Class对象。
        Class c = Cat.class;
        //2.获取类的全部成员方法
        Method[] methods = c.getDeclaredMethods();
        //3.遍历这个数组中的每个方法对象
        for (Method method : methods) {
            System.out.println(method.getName() + "--->" + method.getParameterCount() + "--->" + method.getReturnType());
        }
    }

    @Test
    public void testGetMethod() throws Exception {
        //1.反射第一步：先得到Class对象。
        Class c = Cat.class;
        //2.获取类的某个成员方法
        Method runMethod = c.getDeclaredMethod("run");//拿run方法，无参数的

        System.out.println(runMethod.getName() + "--->" + runMethod.getParameterCount() + "--->" + runMethod.getReturnType());

        Method eatMethod = c.getDeclaredMethod("eat", String.class);//拿run方法，无参数的

        System.out.println(eatMethod.getName() + "--->" + eatMethod.getParameterCount() + "--->" + eatMethod.getReturnType());

        //执行成员方法
        Cat cat = new Cat();
        runMethod.setAccessible(true);
        Object rm = runMethod.invoke(cat);
        System.out.println(rm);

        eatMethod.setAccessible(true);
        String em = (String) eatMethod.invoke(cat, "鱼");
        System.out.println(em);
    }
}
