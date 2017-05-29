package com.ceaser.jdk8lambda.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2017/2/11.
 */
public class TestStream12 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("hi","hello","你好");
        List<String>  list2 = Arrays.asList("zhangsan","lisi","wangwu","zhaoliu");

        /*list1.stream().forEach( (item) -> {
            list2.stream().forEach( (iitem) -> {
                System.out.println(item+iitem);
            } );
        });*/
        list1.stream().flatMap( item -> list2.stream().map(item2 -> item+" "+item2)).collect(Collectors.toList()).forEach(System.out::println);


    }
}
