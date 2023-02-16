package com.learnJava.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

//        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> { return a.compareTo(b);};
        Comparator<Integer> comparatorLambda = (a, b) -> a.compareTo(b);
        System.out.println("Result using lambda is : " + comparatorLambda.compare(4,3));
    }
}
