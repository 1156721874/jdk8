package com.ceaser.jdk8lambda.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by Administrator on 2017/3/25.
 */
public class StreamTestOther {

    public static void main(String[] args) {
        List<String> list1 = null;
        Objects.requireNonNull(list1);
        List<String> list = Arrays.asList("hello","workd");
        System.out.println();
        list.stream().map(x -> x).forEach( x -> System.out.println(x));
    }

}
