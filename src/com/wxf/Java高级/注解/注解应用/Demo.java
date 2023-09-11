package com.wxf.Java高级.注解.注解应用;

import org.junit.Test;

/**
 * @Author Ssanshu
 * @Date 2023-09-11
 */
@MyTest(value = "123",aaa = 123.1,bbb = {"123","234"})
public class Demo {
    @Test@MyTest(value = "234",aaa = 234.2,bbb = {"234","345"})
    public void test(){}
}
