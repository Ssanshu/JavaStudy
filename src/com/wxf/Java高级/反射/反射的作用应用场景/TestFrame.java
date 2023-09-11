package com.wxf.Java高级.反射.反射的作用应用场景;

import org.junit.Test;

import java.io.PrintStream;

/**
 * @Author Ssanshu
 * @Date 2023-09-11
 */
public class TestFrame {
    @Test
    public void print() throws Exception {

        Student student = new Student("张三",15);
        Teacher teacher = new Teacher("李四",26);

        ObjectFrame.saveObject(student);
        ObjectFrame.saveObject(teacher);
    }
}
