package com.ceaser.jdk8lambda.jdk8;

import java.util.function.Supplier;

/**
 * Created by Administrator on 2017/1/8.
 */
public class SupplierTest {

    public static void main(String[] args) {
        Supplier<Student> supplier = Student::new;
        System.out.println(supplier.get().getName());
    }
}
