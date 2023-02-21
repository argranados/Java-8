package com.learnJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class StreamMinMaxExample {

    public static int findMaxValue(List<Integer> integerList){
        return integerList.stream()
                .reduce(0, (x,y) -> x>y? x : y);
    }

    public static Optional<Integer> findMinValue(List<Integer> integerList){
        return integerList.stream()
                .reduce((x,y) -> x<y? x : y);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);

        int maxValur = findMaxValue(integerList);
        System.out.println("max value is : "+maxValur);

        Optional<Integer> minValue= findMinValue(integerList);
        if (minValue.isPresent()){
            System.out.println("min value is : "+minValue.get());
        } else {
            System.out.println("No Input passed");
        }
    }
}
