package com.learnJava.methodreference;

import java.util.Locale;
import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String, String> toUpperCaselambda = (s) -> s.toUpperCase(Locale.ROOT);
    static Function<String, String> toUpperMethodReference = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperCaselambda.apply("java8"));
        System.out.println(toUpperMethodReference.apply("java8"));
    }
}
