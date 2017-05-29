package com.ceaser.jdk8lambda.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/1/18.
 */
public class StreamTest3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(list.stream().map(i -> i * 2).reduce(0, Integer::sum));

    }
}
