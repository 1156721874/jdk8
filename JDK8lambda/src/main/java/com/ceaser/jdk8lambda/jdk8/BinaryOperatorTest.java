package com.ceaser.jdk8lambda.jdk8;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 * Created by Administrator on 2017/1/8.
 */
public class BinaryOperatorTest {

    public static void main(String[] args) {
        BinaryOperatorTest  BinaryOperatorTest = new BinaryOperatorTest();
        Integer rnum =   BinaryOperatorTest.compute(2,3,(num1,num2) -> {return num1 * num2;},value -> 2*value);
        System.out.println(rnum);
        System.out.println("-------------------------------------");
        Integer rnum2 =   BinaryOperatorTest.compute(2,3,(num1,num2) -> {return num1 * num2;});
        System.out.println(rnum2);
        System.out.println("-------------------------------------");
        Integer rnum3 =   BinaryOperatorTest.computeA(2,3,(num1,num2) ->   num1.compareTo(num2));
        System.out.println(rnum3);
    }

    public Integer compute(Integer a, Integer b, BinaryOperator<Integer> binaryoperator, Function<Integer,Integer> function) {
        return binaryoperator.andThen(function).apply(a,b);
    }


    public Integer compute(Integer a, Integer b, BinaryOperator<Integer> binaryoperator) {
        return binaryoperator.apply(a,b);
    }


    public Integer computeA(Integer a, Integer b, Comparator<Integer> comparator){
        return BinaryOperator.minBy(comparator).apply(a,b);
    }
}
