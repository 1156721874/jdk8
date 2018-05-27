package com.ceaser.jdk8lambda.stream2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/2/18.
 */
public class MyCollectorTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","welcome","helloworld","helloworld");
        System.out.println(list.stream().collect(new MyCollector()));
    }
}
