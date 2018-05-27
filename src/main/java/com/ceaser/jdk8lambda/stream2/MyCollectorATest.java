package com.ceaser.jdk8lambda.stream2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;

/**
 * Created by Administrator on 2017/2/27.
 */
public class MyCollectorATest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","welcome","helloworld","helloworldA");
        Set<String> set = new HashSet<>();
        set.addAll(list);
        Map<String,String> maped =  set.stream().collect(new MyCollectorA<>());
       /*for (int i=0;i<10;i++){
           Map<String,String> maped1 =  set.parallelStream().collect(new MyCollectorA<>());
          //  Map<String,String> maped =  set.stream().collect(new MyCollectorA<>());
            System.out.println(maped);
        }*/
    }
}
