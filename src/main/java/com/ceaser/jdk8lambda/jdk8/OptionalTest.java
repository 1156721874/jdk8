package com.ceaser.jdk8lambda.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

/**
 * Created by Administrator on 2017/1/8.
 * optional 不要作为成员变量或者参数，optional只是为了应对null异常而来的
 */
public class OptionalTest {
    public static void main(String[] args) {
        OptionalTest OptionalTest = new OptionalTest();
        OptionalTest.optionalA();
        OptionalTest.optionalB();
    }


    public void optionalA(){
        //Optional optional = Optional.of("hello");
        Optional optional = Optional.ofNullable(null);
        optional.ifPresent(item -> System.out.println(item));

        System.out.println(optional.orElse("world"));
        System.out.println(optional.orElseGet(() -> "opop"));
    }


    public void optionalB(){
        Company company = new Company();
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        company.setEmployyee(Arrays.asList(e1,e2));

        Optional<Company> optional = Optional.ofNullable(company);
        System.out.println(optional.map(icompany -> icompany.getEmployyee()).orElse(Collections.emptyList()));

    }

}
