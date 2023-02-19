package com.learnJava.FunctionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String,String> function = name -> name.toUpperCase();
    static Function<String,String> addSomeString = name -> name.concat("default");

    public static void main(String[] args) {
        System.out.println("Result is : " + function.apply("java 8"));
        System.out.println("Result of andThen is : " + function.andThen(addSomeString).apply("java 8"));
        System.out.println("Result of andThen is : " + function.compose(addSomeString).apply("java 8"));
    }
}

//As you can see, the difference between compose and andThen is the order they execute the functions.
// While the compose function executes the caller last and the parameter first,
// the andThen executes the caller first and the parameter last.