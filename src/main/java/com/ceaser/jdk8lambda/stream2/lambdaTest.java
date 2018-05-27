package com.ceaser.jdk8lambda.stream2;

/**
 * Created by Administrator on 2017/3/31.
 */
public class lambdaTest {

    Runnable r1 = () -> System.out.println(this);//lambdaTest

    Runnable r2 = new Runnable() {
        @Override
        public void run() {
            System.out.println(this);//匿名内部类
        }
    };

    public static void main(String[] args) {
        lambdaTest lt = new lambdaTest();
        Thread t1 = new Thread(lt.r1);
        t1.start();
        Thread t2 = new Thread(lt.r2);
        t2.start();

    }

}
