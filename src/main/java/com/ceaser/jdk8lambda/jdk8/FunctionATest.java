package com.ceaser.jdk8lambda.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by Administrator on 2017/1/8.
 */
public class FunctionATest {

    public static void main(String[] args) {
        FunctionATest functionTestA = new FunctionATest();
       // functionTestA.testfunction1();
        System.out.println(functionTestA.computeA(3,value -> value = value * 3,value -> value+1));

        System.out.println(functionTestA.computeB(3,value -> value = value * 3,value -> value+1));

        System.out.println(functionTestA.computeC(3,4,(value1,value2) -> {return value1+value2;},value -> value*value));
    }

    public void testfunction1(){
        List<String> list = Arrays.asList("zhangsan","lisi","wangwu");
         Collections.sort(list,(o1,o2) -> {return o1.compareTo(o2); });
        Collections.sort(list,(o1,o2) ->  o1.compareTo(o2));

        list.forEach((item) -> System.out.println(item));
         list.forEach(String::toUpperCase);
         list.stream().map(String::toUpperCase).forEach(item -> System.out.println(item));


    }

    public int  computeA(int a, Function<Integer,Integer> function,Function<Integer,Integer> befor ){
        return  function.compose(befor).apply(a);
    }

    public int  computeB(int a, Function<Integer,Integer> function,Function<Integer,Integer> after ){
        return  function.andThen(after).apply(a);
    }

    public int  computeC(int a,int b, BiFunction<Integer, Integer,Integer> bifunction, Function<Integer,Integer> function ){
        return  bifunction.andThen(function).apply(a,b);
    }

}
