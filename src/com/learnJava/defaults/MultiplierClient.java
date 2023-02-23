package com.learnJava.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> integerList = Arrays.asList(1,3,5);

//        System.out.println("Result is: "+multiplier.multiply(integerList));
        System.out.println("default is: "+multiplier.size(integerList));
        System.out.println(multiplier.test());
        System.out.println("Static method "+Multiplier.isEmpty(integerList));

    }
}
