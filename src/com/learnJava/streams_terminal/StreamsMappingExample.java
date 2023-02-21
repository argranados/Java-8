package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMappingExample {

    public static void main(String[] args) {
        List<String> listNames=  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(student -> student.getName(),Collectors.toList()));

        System.out.println("Names List " + listNames);

        Set<String> namesSet=  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(student -> student.getName(),Collectors.toSet()));

        System.out.println("names Set "+ namesSet);
    }
}
