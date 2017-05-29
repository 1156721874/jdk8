package com.ceaser.jdk8lambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Administrator on 2017/1/18.
 */
public class StreamTest1 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4);
        String [] list = new String []{"hello","world","hello world"};
        Stream stream2 = Stream.of(list);

        Stream stream3 = Arrays.stream(list);

    }

}
