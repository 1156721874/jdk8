package com.ceaser.jdk8lambda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/2/9.
 */
public class StreamTest9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 5000000; i++){
            list.add(UUID.randomUUID().toString());
        }
        System.out.println("starting order....");
        long start = System.nanoTime();

        //排序
        list.stream().sorted().count();//order speed time : 4003
        //并行流
       // list.parallelStream().count();//order speed time : 99

        long end = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(end-start);

        System.out.println("order speed time : "+millis);

    }
}
