package com.ceaser.jdk8lambda.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2017/1/8.
 */
public class PersonTest {

    public static void main(String[] args) {
        Person p1 = new Person(20,"zhangsan");
        Person p2 = new Person(30,"lisi");
        Person p3 = new Person(40,"wangwu");
        List<Person> persons = Arrays.asList(p1,p2,p3);

        PersonTest ptest = new PersonTest();
        List<Person> rlist =  ptest.getPersonByname("zhangsan",persons);
        rlist.forEach(person -> System.out.println(person.getName()));

        System.out.println("--------------------------------------");
        List<Person> rlist1 =  ptest.getPersonByNameB("lisi",persons,(iname,ipersons) -> ipersons.stream().filter(iiperson -> iiperson.getName().equals(iname)).collect(Collectors.toList()) );
        rlist1.forEach(person -> System.out.println(person.getName()));

        System.out.println("--------------------------------------");
        List<Person> rlist2 =  ptest.getPersonByNameC("wangwu",persons);
        rlist2.forEach(person -> System.out.println(person.getName()));

    }

    public List<Person> getPersonByname(String name,List<Person> ipersons){
        return ipersons.stream().filter(person -> person.getName().equals(name)).collect(Collectors.toList());
    }

    public List<Person> getPersonByNameB(String name, List<Person> ipersons, BiFunction<String,List<Person>,List<Person>> bifunction){
        return bifunction.apply(name,ipersons);
    }

    public List<Person> getPersonByNameC(String name, List<Person> ipersons){
        BiFunction<String,List<Person>,List<Person>> bifunction =   (tname,tpersons) -> tpersons.stream().filter(person -> tname.equals(person.getName())).collect(Collectors.toList());
        return bifunction.apply(name,ipersons);
    }

}
