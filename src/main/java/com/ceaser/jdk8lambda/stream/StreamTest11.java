package com.ceaser.jdk8lambda.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2017/2/9.
 * flatMap 打散输出
 */
public class StreamTest11 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello world","welcome world","hello welcome");
        //list.stream().map(item -> item.split(" ")).distinct().collect(Collectors.toList()).forEach(System.out::println);
        list.stream().map(item -> item.split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()).forEach(System.out::println);

    }
}
