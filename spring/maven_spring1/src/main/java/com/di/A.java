package com.di;

import org.springframework.stereotype.Component;

@Component
public class A {

    public B b;

    public A(B b) {
        this.b = b;
    }

    public void method() {
        System.out.println("b");
        b.method();
    }

//    public B getB() {
//        return b;
//    }
//
//    public void setB(B b) {
//        this.b = b;
//    }
//
//
//    public void method(){
//        System.out.println("b");
//        b.methodB();
//    }
}
