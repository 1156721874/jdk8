package com.ceaser.jdk8lambda.stream;

import java.util.stream.IntStream;

/**
 * Created by Administrator on 2017/1/18.
 * 流的范围输出
 */
public class StreamTest2 {
    public static void main(String[] args) {
        //输出整个集合
         IntStream.of(new int []{1,2,3,4,5}).forEach(System.out::println);
        System.out.println("------------------");
        //不包含5
        IntStream.range(1,5).forEach(System.out::println);
        System.out.println("------------------");
        //包含5
        IntStream.rangeClosed(1,5).forEach(System.out::println);
    }
}
