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
        //将流的每个元素转换为大写输出
        List<String> list = Arrays.asList("hello","world","hello world","test");
        list = list.stream().map((str) -> {return str.toUpperCase();}).collect(Collectors.toList());
        list.forEach(System.out::println);

        System.out.println("---------------");

        //将整数类型的流的每个元素平方之后输出
        List<Integer> ilist = Arrays.asList(1,2,3,4,5);
        ilist.stream().map(item -> item * item).forEach(System.out::println);

        System.out.println("---------------");

        //flatMap的使用方式，将多个集合打散成为一个整体流然后进行操作后输出
       Arrays.asList(Arrays.asList(1),Arrays.asList(2,3),Arrays.asList(4,5,6)).stream().flatMap(tlist -> tlist.stream()).map(item -> item * item).forEach(System.out::println);
    }
}
