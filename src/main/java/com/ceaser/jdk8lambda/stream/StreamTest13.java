package com.ceaser.jdk8lambda.stream;

import java.sql.Struct;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2017/2/11.
 */
public class StreamTest13 {

    public static void main(String[] args) {
        Student s1= new Student("zhansan",60,20);
        Student s2= new Student("lisi",50,30);
        Student s3= new Student("wangwu",30,40);
        Student s4= new Student("zhangsanfeng",100,50);
//按照姓名分组
        List<Student> students = Arrays.asList(s1,s2,s3,s4);
        Map<String,List<Student>> maps = students.stream().collect(Collectors.groupingBy(Student::getName));
        System.out.println(maps);

        //按照成绩分组，并且计算每个分组的大小
        Map<Integer,Long> maps1 = students.stream().collect(Collectors.groupingBy(Student::getScore,Collectors.counting()));
        System.out.println(maps1);
        //按照成绩分组，并且计算每个分组的平均分
        Map<Integer,Double> maps2 = students.stream().collect(Collectors.groupingBy(Student::getScore,Collectors.averagingDouble(Student::getScore)));
        System.out.println(maps2);
        //按照成绩分区。大于90分的一个分区，小于90分的一个分区，只有true和false分区
       Map<Boolean,List<Student> > maps3 =  students.stream().collect(Collectors.partitioningBy(item -> item.getScore()>90));
        System.out.println(maps3);


    }
}
