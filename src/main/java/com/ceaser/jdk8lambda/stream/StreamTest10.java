package com.ceaser.jdk8lambda.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/2/9.
 * 流的短路功能
 */
public class StreamTest10 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world");
        //list.stream().mapToInt(item -> item.length()).filter( length -> length==5).findFirst().ifPresent(System.out::println);

        list.stream().mapToInt(item -> {
            int length = item.length();
            System.out.println(item);
            return length;
        }).filter( length -> length==5).findFirst().ifPresent(System.out::println);
    }
}
