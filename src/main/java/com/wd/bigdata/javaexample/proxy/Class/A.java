package com.wd.bigdata.javaexample.proxy.Class;

import lombok.Data;

/**
 * Created by Peter on 17/05/2017.
 */
@Data
public class A {

    private String field1;
    private int field2;
    private float field3;


    public A() {
    }

    public A(String field1) {
        this.field1 = field1;
    }

    public A(String field1, int field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public A(String field1, int field2, float field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }
}
