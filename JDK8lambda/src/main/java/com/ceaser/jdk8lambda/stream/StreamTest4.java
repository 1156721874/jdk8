package com.ceaser.jdk8lambda.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Administrator on 2017/2/6.
 */
public class StreamTest4 {
    public static void main(String[] args) {
        /*Stream<String> stream = Stream.of("hello","world","hello world");
        String [] streamArr = stream.toArray(String[]::new);
        Arrays.asList(streamArr).forEach(System.out::println);*/

        /*Stream<String> stream = Stream.of("hello","world","hello world");
        List<String> list1 = stream.collect(Collectors.toList());
        List<String> list = stream.collect(LinkedList::new, LinkedList::add,LinkedList::addAll);
        list.forEach(System.out::println);*/

        /*Stream<String> stream = Stream.of("hello","world","hello world");
       List<String> list =  stream.collect(Collectors.toCollection(ArrayList::new));
        list.forEach(System.out::println);*/

        /*Stream<String> stream = Stream.of("hello","world","hello world");
        Set<String> list =  stream.collect(Collectors.toCollection(TreeSet::new));
        list.forEach(System.out::println);*/

        Stream<String> stream = Stream.of("hello","world","hello world");
       String str =  stream.collect(Collectors.joining()).toString();
        System.out.println(str);
    }
}
