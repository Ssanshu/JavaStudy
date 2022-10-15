package com.wxf.泛型.类型通配符;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        // 类型通配符
        List<?> list = new ArrayList<Object>();
        List<?> list1 = new ArrayList<Number>();
        List<?> list2 = new ArrayList<Integer>();
//        ----------------------------
//        List<? extends Number> list = new ArrayList<Number>();
//        List<? extends Number> list1 = new ArrayList<Object>(); // 报错
//        List<? extends Number> list2 = new ArrayList<Integer>();
//        ----------------------------
//        List<? super Number> list = new ArrayList<Number>();
//        List<? super Number> list1 = new ArrayList<Object>();
//        List<? super Number> list2 = new ArrayList<Integer>(); // 报错
    }
}
