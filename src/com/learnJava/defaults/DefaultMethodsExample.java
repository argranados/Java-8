package com.learnJava.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Adam","Jenny","Alex","Dan","Mike","Erick");

/*        Collections.sort(stringList);
        System.out.println(stringList);*/

        //Java8
        stringList.sort(Comparator.naturalOrder());
        System.out.println(stringList);

        stringList.sort(Comparator.reverseOrder());
        System.out.println(stringList);
    }
}
