package com.wxf.泛型.泛型接口;



public class Test {
    public static void main(String[] args) {
        Generic generic = new Genericimpl();
        Generic<String> gener = new Genericimpl();

        generic.show(1);
        generic.show("张三");
        generic.show(true);
        generic.show(14.34);

        gener.show("王五");
    }
}
