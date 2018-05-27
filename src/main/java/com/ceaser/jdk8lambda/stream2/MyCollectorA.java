package com.ceaser.jdk8lambda.stream2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collector.Characteristics.CONCURRENT;
import static java.util.stream.Collector.Characteristics.IDENTITY_FINISH;
import static java.util.stream.Collector.Characteristics.UNORDERED;

/**
 * Created by Administrator on 2017/2/27.
 */
public class MyCollectorA<T> implements Collector<T,Set<T>,Map<T,T>> {
    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier invoked...");
        return HashSet::new;
    }

    @Override
    public BiConsumer<Set<T>,T> accumulator() {
        System.out.println("accumulator invoked...");
        return (item1,item2) -> {

            /**
             *  *  A a1 = supplier.get();
             *     accumulator.accept(a1, t1);
             *     accumulator.accept(a1, t2);
             *     R r1 = finisher.apply(a1);  // result without splitting
             *
             *     A a2 = supplier.get();
             *     accumulator.accept(a2, t1);
             *     A a3 = supplier.get();
             *     accumulator.accept(a3, t2);
             *     R r2 = finisher.apply(combiner.apply(a2, a3));  // result with splitting
             */

          //  System.out.println("current thread : "+item1+" , "+Thread.currentThread().getName());
            item1.add(item2);
        };

    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoked...");
        return (item1,item2) -> {
            item1.addAll(item2);
            System.out.println("--------");
            return item1;
        };
    }

    @Override
    public Function<Set<T>,Map<T,T>> finisher() {
        System.out.println("finisher invoked...");
        return (item1) ->{
            Map<T,T> rm = new HashMap<T,T>();
            item1.stream(). forEach( (bean) -> rm.put(bean,bean) );
          return rm;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoked...");
        return Collections.unmodifiableSet(EnumSet.of(UNORDERED,CONCURRENT,IDENTITY_FINISH));
    }

}
