package com.ceaser.jdk8lambda.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Administrator on 2017/3/12.
 */
public class StreamTest2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world");
        try(Stream<String> stream  = list.stream()){
            stream.onClose(() -> {
                System.out.println("aaaa");
                throw new NullPointerException("first exception");
            }).onClose(() ->{
                System.out.println("bbb");
                throw new NullPointerException("second exception");
            }).forEach(System.out::println);
        }
    }
}
