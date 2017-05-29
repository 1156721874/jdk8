package com.ceaser.jdk8lambda.stream;

import java.util.stream.IntStream;

/**
 * Created by Administrator on 2017/1/18.
 */
public class StreamTest2 {
    public static void main(String[] args) {
         IntStream.of(new int []{1,2,3,4,5}).forEach(System.out::println);
        System.out.println("------------------");
        IntStream.range(1,5).forEach(System.out::println);
        System.out.println("------------------");
        IntStream.rangeClosed(1,5).forEach(System.out::println);
    }
}
