package com.ceaser.jdk8lambda.jdk8.com.ceaser.jdk8lambda.defaultmethod;

/**
 * Created by Administrator on 2017/1/16.
 */
public class Myclass implements  MyInterface,MyInterface1 {

  public  void  meyhod(){
       System.out.println("Myclass");
      //MyInterface1.super.meyhod();
    }

    public static void main(String[] args) {
        Myclass myclass = new Myclass();
        myclass.meyhod();

        FixClass fixClass = new FixClass();
        fixClass.meyhod();
    }

}
