package com.ceaser.jdk8lambda.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

/**
 * Created by Administrator on 2017/2/7.
 */
public class StreamTest7 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,3,5,7,9,11);
        //System.out.println(stream.filter(item -> item>2).mapToInt(mitem -> mitem*2).skip(2).limit(2).sum());
        //stream.filter(item -> item>2).mapToInt(mitem -> mitem*2).skip(2).limit(2).min().ifPresent(System.out::println);

        IntSummaryStatistics intsummarystatistics=  stream.filter(item -> item>2).mapToInt(mitem -> mitem*2).skip(2).limit(2).summaryStatistics();
        //计算过程
        //stream.filter(item -> item>2) : 3,5,7,9,11
        //mapToInt(mitem -> mitem*2) :6,10,14,18,22
        //skip(2) : 14,18,22
        //limit(2) : 4,18

        System.out.println(intsummarystatistics.getMax());
        System.out.println(intsummarystatistics.getCount());
        System.out.println(intsummarystatistics.getMin());

    }
}
