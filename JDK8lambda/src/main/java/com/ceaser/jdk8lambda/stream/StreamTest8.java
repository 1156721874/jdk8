package com.ceaser.jdk8lambda.stream;

import java.util.stream.IntStream;

/**
 * Created by Administrator on 2017/2/9.
 */
public class StreamTest8 {

    public static void main(String[] args) {
        //错误的方式
       // IntStream.iterate(0, i -> (i + 1)%2).distinct().limit(6).forEach(System.out::println);
        //正确的方式
        IntStream.iterate(0, i -> (i + 1)%2).limit(6).distinct().forEach(System.out::println);
    }
}
