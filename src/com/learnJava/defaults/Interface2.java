package com.learnJava.defaults;

public interface Interface2 extends Interface1{
    default void methodB(){
        System.out.println("Inside method B");
    }
}
