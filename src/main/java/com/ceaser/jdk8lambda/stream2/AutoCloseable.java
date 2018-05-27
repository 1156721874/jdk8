package com.ceaser.jdk8lambda.stream2;

/**
 * Created by Administrator on 2017/3/5.
 */
public class AutoCloseable implements java.lang.AutoCloseable {

    public void doSomeThing(){
        System.out.println("invoked dosonething");
    }

    public void close() throws Exception {
        System.out.println("invoked close...");
    }

    public static void main(String[] args) throws Exception {
        try(AutoCloseable autocloseable  = new AutoCloseable();){
            autocloseable.doSomeThing();
        }
    /* 此种调用方式不能隐式调用close方法
     try {
            AutoCloseable autocloseable  = new AutoCloseable();
            autocloseable.doSomeThing();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
