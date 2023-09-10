package com.wxf.Java高级.反射.获取构造器对象并使用;

/**
 * @Author Ssanshu
 * @Date 2023-09-10
 */

import com.wxf.Java高级.反射.获取类的成员方法.Cat;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * 目标：掌握获取类的构造器，并对其进行操作。
 */
public class TestConstructor {
    @Test
    public void testGetConstructors() {
        //1.反射第一步：必须得到这个类的Class对象
        Class c = Cat.class;
        //2.获取类的全部构造器
//        Constructor[] constructors =  c.getConstructors();
        Constructor[] constructors = c.getDeclaredConstructors();
        //3.遍历数组中的每个构造器对象
        for (Constructor co : constructors) {
            System.out.println(co.getName() + "---->" + co.getParameterCount());
        }
    }

    @Test
    public void tip() {
        System.out.println("-------------------------------");
    }

    @Test
    public void testGetConstructor() throws Exception {
        //1.反射第一步：必须得到这个类的Class对象
        Class c = Cat.class;
        //2.获取类的某个无参构造器
//        Constructor constructor = c.getConstructor();
        Constructor constructor = c.getDeclaredConstructor();
        System.out.println(constructor.getName() + "---->" + constructor.getParameterCount());
        constructor.setAccessible(true);
        Cat cat = (Cat) constructor.newInstance();
        System.out.println(cat);

        //3.获取类的有参构造器
        Constructor constructor1 = c.getDeclaredConstructor(String.class, int.class);
        System.out.println(constructor1.getName() + "---->" + constructor1.getParameterCount());
        constructor1.setAccessible(true);
        Cat cat1 = (Cat) constructor1.newInstance("叮当猫",12);
        System.out.println(cat1);
    }
}
