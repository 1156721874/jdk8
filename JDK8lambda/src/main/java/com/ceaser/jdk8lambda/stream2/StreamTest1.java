package com.ceaser.jdk8lambda.stream2;

import com.ceaser.jdk8lambda.stream2.Student;

import java.util.*;
import java.util.stream.Collector;

import static  java.util.stream.Collectors.*;

/**
 * Created by Administrator on 2017/2/11.
 */
public class StreamTest1 {
    public static void main(String[] args) {
        Student s1= new Student("zhansan",60,20);
        Student s2= new Student("lisi",50,30);
        Student s3= new Student("wangwu",50,40);
        Student s4= new Student("lisi",50,50);

        List<Student> students = Arrays.asList(s1,s2,s3,s4);

        students.stream().collect(minBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);
        students.stream().collect(maxBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);
        System.out.println( students.stream().collect(averagingInt(Student::getScore)));
        System.out.println( students.stream().collect(summingInt(Student::getScore)));
        System.out.println( students.stream().collect(summarizingInt(Student::getScore)));

        System.out.println("-------joining-------");

        System.out.println(    students.stream().map(student -> student.getName()).collect(joining()));
        System.out.println(   students.stream().map(student -> student.getName()).collect(joining(", ")));
        System.out.println(  students.stream().map(student -> student.getName()).collect(joining(", ","<start>","<end>")));

        System.out.println("-------double groupingBy-------");
        Map<Integer,Map<String,List<Student>>> maps1 =  students.stream().collect(groupingBy(Student::getScore,groupingBy(Student::getName)));
        System.out.println(maps1);

        System.out.println("-------partition-------");
        Map<Boolean,List<Student >> map2 =  students.stream().collect(partitioningBy( student  -> student.getScore()>90));
        System.out.println(map2);

        Map<Boolean,Map<Boolean, List<Student >>> map3 =  students.stream()
                .collect(partitioningBy( student  -> student.getScore()>50,partitioningBy(student -> student.getScore()>90)));
        System.out.println(map3);

        Map<Boolean,Long> map4 =  students.stream().collect(partitioningBy(student -> student.getScore()>50,counting()));
        System.out.println(map4);

        //先分组，出来的数据集合肯定会有值，可以直接掉 Optional::get 没有NPE
        Map<String,Student> collect = students.stream()
                .collect(groupingBy(Student::getName, collectingAndThen(minBy(Comparator.comparingInt(Student::getScore)), Optional::get)));
        System.out.println(collect);

    }
}
