package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integerList){
        return integerList.stream()
                .reduce(1,(a,b) -> a*b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList){
        return integerList.stream()
                .reduce((a,b) -> a*b);
    }

    public static Optional<Student> getHighestGPAStudent(){
        return
        StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2)->{
                    if(s1.getGpa()>s2.getGpa()){
                        return s1;
                    } else {
                        return s2;
                    }
                });
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,5,7);
        System.out.println(performMultiplication(integers));

        Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
        System.out.println(result.isPresent());
        System.out.println(result.get());

        if(getHighestGPAStudent().isPresent()){
            System.out.println(getHighestGPAStudent().get());
        }
    }
}
