package com.ceaser.jdk8lambda.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Administrator on 2017/1/8.
 */
public class PredicateTest {

    public static void main(String[] args) {
        Predicate<String> mypredicate = value -> value.length()>5;
        System.out.println(mypredicate.test("hello55s"));

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        PredicateTest predicatetest = new PredicateTest();
        predicatetest.condationA(nums,value -> value>5);
        System.out.println("\n---------------------------");
        predicatetest.condationA(nums,value -> value % 2 ==0);
        System.out.println("\n---------------------------");

        System.out.println(predicatetest.condationEqual("test").test("test"));
    }

    public void condationA(List<Integer> list, Predicate<Integer> predate){
        for(Integer item : list){
            if(predate.test(item)){
                System.out.print(item);
            }
        }
    }

    public Predicate<String> condationEqual(Object obj){
        return Predicate.isEqual(obj) ;
    }

}
