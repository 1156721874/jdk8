package com.ceaser.jdk8lambda.stream2;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/**
 * Created by Administrator on 2017/3/18.
 */
public class ConsumerTest {

    public static void main(String[] args) {
        ConsumerTest ct  = new ConsumerTest();
        Consumer<Integer> coonsumer = (item) -> System.out.println(item);
        ct.doconsumer(coonsumer,100);//面向对象的方式
        ct.doIntConsumer((item) -> System.out.println(item),2);//面向行为
        ct.doconsumer((item) -> System.out.println(item),2);//面向行为

    }

    public void doconsumer(Consumer<Integer> c,Integer d){
        c.accept(d);
    }
    public void doIntConsumer(IntConsumer c, Integer d){
        c.accept(d);
    }

}
