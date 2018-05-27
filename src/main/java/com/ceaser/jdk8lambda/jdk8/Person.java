package com.ceaser.jdk8lambda.jdk8;

/**
 * Created by Administrator on 2017/1/8.
 */
public class Person {

    private String name;

    private int age;

    public Person(int age, String name  ) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
