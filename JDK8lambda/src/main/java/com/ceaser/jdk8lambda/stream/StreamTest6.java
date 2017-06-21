package com.ceaser.jdk8lambda.stream;

import java.util.UUID;
import java.util.stream.Stream;

/**
 * Created by Administrator on 2017/2/7.
 */
public class StreamTest6 {
    public static void main(String[] args) {
        //避免NPE方式输出流
        //Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
        Stream<String> stream = Stream.empty();
       stream.findFirst().ifPresent(System.out::println);
        System.out.println("----------------------------");
        //初始值是1，后一个元素是前一个元素的值加2，一直循环到第六个，然后输出
        Stream.iterate(1, item -> item+2).limit(6).forEach(System.out::println);



    }
}
