package com.ceaser.jdk8lambda.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Administrator on 2017/2/6.
 */
public class StreamTest4 {
    public static void main(String[] args) {
        //流转为集合
        /*Stream<String> stream = Stream.of("hello","world","hello world");
        String [] streamArr = stream.toArray(String[]::new);
        Arrays.asList(streamArr).forEach(System.out::println);*/

        //流转换为集合通过收集器方式实现
        /*Stream<String> stream = Stream.of("hello","world","hello world");
        List<String> list1 = stream.collect(Collectors.toList());
        List<String> list = stream.collect(LinkedList::new, LinkedList::add,LinkedList::addAll);
        list.forEach(System.out::println);*/

        //流转为集合使用收集器并且指明实际集合类型
        /*Stream<String> stream = Stream.of("hello","world","hello world");
       List<String> list =  stream.collect(Collectors.toCollection(ArrayList::new));
        list.forEach(System.out::println);*/

        //流抓换为Set
        /*Stream<String> stream = Stream.of("hello","world","hello world");
        Set<String> list =  stream.collect(Collectors.toCollection(TreeSet::new));
        list.forEach(System.out::println);*/

        //将流的元素拼接输出
        Stream<String> stream = Stream.of("hello","world","hello world");
       String str =  stream.collect(Collectors.joining()).toString();
        System.out.println(str);
    }
}
