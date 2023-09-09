package com.wxf.Java高级.Junit单元测试框架的常用注解;

/**
 * @Author Ssanshu
 * @Date 2023-09-09
 */

import org.junit.*;

/**
 * 测试类
 */
public class StringUtilTest {

    @Before
    public void test1(){
        System.out.println("--->test1 Before 执行了--------");
    }

    @BeforeClass
    public static void test11(){
        System.out.println("--->test11 Before 执行了--------");
    }

    @After
    public void test2(){
        System.out.println("--->test2 after 执行了--------");
    }

    @AfterClass
    public static void test22(){
        System.out.println("--->test22 after 执行了--------");
    }

    @Test
    public void testPrintNumber(){
        StringUtil.printNumber("hello");
        StringUtil.printNumber(null);
    }

    @Test
    public void getMaxIndex(){
        int Index = StringUtil.getMaxIndex(null);
        System.out.println(Index);

        int index = StringUtil.getMaxIndex("hello world");
        System.out.println(index);

        //断言机制:程序员可以通过预测业务方法的结果。
//        Assert.assertArrayEquals("代码有bug！",10,index);
        Assert.assertEquals("代码有bug!",10,index);
    }
}
