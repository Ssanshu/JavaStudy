package com.wxf.Java高级.反射.反射的作用应用场景;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

/**
 * @Author Ssanshu
 * @Date 2023-09-11
 */
public class ObjectFrame {
    //目标：保存任意对象的字段和其数据到文件中
    public static void saveObject(Object object) throws Exception {
        PrintStream ps = new PrintStream(new FileOutputStream("D:\\Study\\javaBasicsStudy\\src\\com\\wxf\\Java高级\\反射\\反射的作用应用场景\\data.txt", true));
        // object是任意对象
        Class<?> objectClass = object.getClass();
        String simpleName = objectClass.getSimpleName();
        // 打印
        ps.println("----------" + simpleName + "----------");
        // 获取类对象的成员变量
        Field[] fields = objectClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String name = field.getName();
            String value = field.get(object) + "";
            ps.println(name + ":" + value);
        }
        ps.close();
    }
}
