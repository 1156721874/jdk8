package com.ceaser.jdk8lambda.jdk8.com.ceaser.jdk8lambda.jdk8.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by Administrator on 2017/1/15.
 */
public class MethodReferenceTest {

    public String toString(Supplier<String> supplier){
        return supplier.get()+"test";
    }

    public String toString2(String str, Function<String,String> function){
        return function.apply(str);
    }


    public static void main(String[] args) {
        Student student1   = new Student("zhangsan",20);
        Student student2   = new Student("lisi",90);
        Student student3   = new Student("wangwu",50);
        Student student4   = new Student("zhaoliu",60);

        List<Student> students = Arrays.asList(student1,student2,student3,student4);

/*        students.sort((studentparam1,studentparam2) -> Student.coompareStudentByName(studentparam1,studentparam2));
        students.forEach(student -> System.out.println(student.getName()));*/
       // 引用静态方法
       /* students.sort( Student::coompareStudentByName);
        students.forEach(student -> System.out.println(student.getName()));

        System.out.println("----------------------------------------------");
//引用某个对象的实例方法
        StudentComparator studentComparator = new StudentComparator();
        students.sort(studentComparator::coompareStudentByScore);
        students.forEach(student -> System.out.println(student.getScore()));*/

        System.out.println("----------------------------------------------");

        //引用某个类型的任意对象的实例方法
        students.sort(Student::compareScore);
        students.forEach(student -> System.out.println(student.getScore()));
        MethodReferenceTest methodReferenceTest =  new MethodReferenceTest();
        //引用构造方法
        System.out.println( methodReferenceTest.toString(String::new));
        System.out.println( methodReferenceTest.toString2("hello",String::new));
    }
}
