package com.ceaser.jdk8lambda.jdk8.com.ceaser.jdk8lambda.jdk8.methodreference;

/**
 * Created by Administrator on 2017/1/15.
 */
public class StudentComparator {

    public  int coompareStudentByScore(Student student1,Student student2){
        return student1.getScore() - student2.getScore();
    }

    public  int coompareStudentByName(Student student1,Student student2){
        return student1.getName().compareToIgnoreCase(student2.getName());
    }

}
