package com.learnJava.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {

    public static void main(String[] args) {

        IntStream intStream = IntStream.range(1,50);

        System.out.println("IntStream");
        System.out.println(intStream.count());
        IntStream.range(1,50).forEach(value -> System.out.print(value+","));
        System.out.println("\nrangeClosed");
        System.out.println(IntStream.rangeClosed(1,50).count());
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value+","));
        System.out.println("\nLongStream");
        System.out.println(LongStream.rangeClosed(1,50).count());
        LongStream.rangeClosed(1,50).forEach(value -> System.out.print(value+","));
        System.out.println("\nDouble Stream");
//        System.out.println(LongStream.rangeClosed(1,50).count());
        IntStream.range(1,50).asDoubleStream().forEach(value -> System.out.print(value+","));
    }
}
