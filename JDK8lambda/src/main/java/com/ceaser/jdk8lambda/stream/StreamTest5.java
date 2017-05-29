package com.ceaser.jdk8lambda.stream;

import javafx.beans.binding.StringBinding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2017/2/7.
 */
public class StreamTest5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world","test");
        list = list.stream().map((str) -> {return str.toUpperCase();}).collect(Collectors.toList());
        list.forEach(System.out::println);

        System.out.println("---------------");

        List<Integer> ilist = Arrays.asList(1,2,3,4,5);
        ilist.stream().map(item -> item * item).forEach(System.out::println);

        System.out.println("---------------");

       Arrays.asList(Arrays.asList(1),Arrays.asList(2,3),Arrays.asList(4,5,6)).stream().flatMap(tlist -> tlist.stream()).map(item -> item * item).forEach(System.out::println);
    }
}
