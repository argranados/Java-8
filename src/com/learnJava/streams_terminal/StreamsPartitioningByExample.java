package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class StreamsPartitioningByExample {

    public static void partitioningBy_1() {

        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;
        Map<Boolean, List<Student>> partiioningMap =
                StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate));

        System.out.println("partitioning map: "+partiioningMap);
    }

    public static void partitioningBy_2() {

        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;
        Map<Boolean, Set<Student>> partiioningMap =
                StudentDataBase.getAllStudents()
                        .stream()
                        .collect(Collectors.partitioningBy(gpaPredicate, toSet()));

        System.out.println("partitioning map: "+partiioningMap);
    }

    public static void main(String[] args) {
        partitioningBy_2();
    }
}
