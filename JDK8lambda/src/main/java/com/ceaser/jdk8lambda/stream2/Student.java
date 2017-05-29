package com.ceaser.jdk8lambda.stream2;

/**
 * Created by Administrator on 2017/2/11.
 */
public class Student {

    private String name;

    private Integer score;

    public Student(String name, Integer score, Integer age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer age;

}
