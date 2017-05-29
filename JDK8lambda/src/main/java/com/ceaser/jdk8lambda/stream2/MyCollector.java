package com.ceaser.jdk8lambda.stream2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collector.Characteristics.*;

/**
 * Created by Administrator on 2017/2/18.
 */
public class MyCollector<T> implements Collector<T, List<T>, List<T>> {


    @Override
    public Supplier<List<T>> supplier() {
        System.out.println("supplier invoked");
        return ArrayList<T>::new;
    }

    @Override
    public BiConsumer<List<T>, T> accumulator() {
        System.out.println("accumulator invoked");
        return List<T>::add;
        //编译失败，原因是：supplier返回的容器是ArrayList，而我们在accumulator里边往LinkedList添加元素和supplier返回的容器是ArrayList的矛盾，但是用list:add是没是的。
        //return LinkedList<T>::add;

    }

    @Override
    public BinaryOperator<List<T>> combiner() {
        System.out.println("combiner invoked");
        return (list1,list2) -> {list1.addAll(list2);return list1;};
    }

    @Override
    public Function<List<T>, List<T>> finisher() {
        System.out.println("finisher invoked");
       // return (list1) -> list1;
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoked");
        return Collections.unmodifiableSet(EnumSet.of(IDENTITY_FINISH,UNORDERED));
    }
}
