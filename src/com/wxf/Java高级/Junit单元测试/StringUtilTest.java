package com.wxf.Java高级.Junit单元测试;

/**
 * @Author Ssanshu
 * @Date 2023-09-09
 */

import org.junit.Assert;
import org.junit.Test;

/**
 * 测试类
 */
public class StringUtilTest {
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
