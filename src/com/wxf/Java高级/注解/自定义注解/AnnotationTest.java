package com.wxf.Java高级.注解.自定义注解;

/**
 * @Author Ssanshu
 * @Date 2023-09-11
 */
@Mytest1(name = "张三", ccc = true, aaa = {1, 2, 3, 4, 5, 6, 7, 8, 9})
public class AnnotationTest {
//    @Mytest2(value = "123", name = "234")
    @Mytest2("value")
    public void test(){}
}
