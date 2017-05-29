package com.ceaser.jdk8lambda.jdk8;

/**
 * Created by Administrator on 2017/1/8.
 */
public class Student {
    private String name = "zhangsan";
    private String age = "20";
     Student(){}

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


}
