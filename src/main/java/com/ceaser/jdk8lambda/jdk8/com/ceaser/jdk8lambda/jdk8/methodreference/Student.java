package com.ceaser.jdk8lambda.jdk8.com.ceaser.jdk8lambda.jdk8.methodreference;

/**
 * Created by Administrator on 2017/1/15.
 */
public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public static int coompareStudentByScore(Student student1,Student student2){
        return student1.getScore() - student2.getScore();
    }


    public static int coompareStudentByName(Student student1,Student student2){
        return student1.getName().compareToIgnoreCase(student2.getName());
    }

    public int compareScore(Student student){
        return this.score-student.getScore();
    }

}
