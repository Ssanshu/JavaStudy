package com.wxf.泛型.泛型接口;

public class Genericimpl <T> implements Generic<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
