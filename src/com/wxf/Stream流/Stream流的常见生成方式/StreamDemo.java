package com.wxf.Stream流.Stream流的常见生成方式;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Author Ssanshu
 * @Date 2023-09-08
 */
public class StreamDemo {
    /*
        Stream流的常见生成方式
            1.Collection体系的集合可以使用默认方法stream()生成流default Stream<E> stream()
            2:Map体系的集合间接的生成流
            3.数组可以通过Stream接口的静态方法of(T... values)生成流
     */

    public static void main(String[] args) {
        // Collection体系的集合可以使用默认方法stream()生成流
        List<String> list = new ArrayList<>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> setStream = set.stream();

        // Map体系的集合间接的生成流
        Map<String, Integer> map = new HashMap<>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<Integer> valueStream = map.values().stream();
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();

        //数组可以通过Stream接口的静态方法of(T... values)生成流
        String[] strArray = {"hello", "world"};
        Stream<String> strArrayStream = Stream.of(strArray);
        Stream<String> stringStream = Stream.of("hello, world, java");
        Stream<Integer> integerStream = Stream.of(10, 20);
    }
}
