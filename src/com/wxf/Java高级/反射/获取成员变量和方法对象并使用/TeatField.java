package com.wxf.Java高级.反射.获取成员变量和方法对象并使用;

/**
 * @Author Ssanshu
 * @Date 2023-09-10
 */

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * 目标：掌握获取类的成员变量，并对其进行操作
 */
public class TeatField {
    @Test
    public void testGetFields() throws Exception {
        //1.反射第一步：必须是先得到类的Class对象
        Class c = Cat.class;
        //2.获取类的全部成员变量
        Field[] field = c.getDeclaredFields();
        //3.遍历这个成员变量数组
        for (Field f : field) {
            System.out.println(f.getName() + "--->" + f.getType());
        }
        //4.定位某个成员变量
        Field fName = c.getDeclaredField("name");
        System.out.println(fName.getName() + "--->" + fName.getType());
        Field fAge = c.getDeclaredField("age");
        System.out.println(fAge.getName() + "--->" + fAge.getType());

        //赋值
        Cat cat = new Cat();
        fName.setAccessible(true);
        fName.set(cat, "小叮当");
        System.out.println(cat);
        //取值
        String name = (String) fName.get(cat);
        System.out.println(name);
    }
}
