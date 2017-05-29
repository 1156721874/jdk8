package com.ceaser.jdk8lambda.stream;

import java.util.UUID;
import java.util.stream.Stream;

/**
 * Created by Administrator on 2017/2/7.
 */
public class StreamTest6 {
    public static void main(String[] args) {
        //Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
        Stream<String> stream = Stream.empty();
       stream.findFirst().ifPresent(System.out::println);

        Stream.iterate(1, item -> item+2).limit(6).forEach(System.out::println);



    }
}
