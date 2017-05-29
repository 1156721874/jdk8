package com.ceaser.jdk8lambda.jdk8;

import java.util.List;

/**
 * Created by Administrator on 2017/1/8.
 */
public class Company {
    public List<Employee> getEmployyee() {
        return employyee;

    }

    public void setEmployyee(List<Employee> employyee) {
        this.employyee = employyee;
    }

    private List<Employee> employyee;
}
