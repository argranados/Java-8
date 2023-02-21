package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities() {
        List<String> studenActivities =
                StudentDataBase.getAllStudents().stream()   //Stream<Student>
                        .map(Student::getActivities)    // Stream<List<String>>
                        .flatMap(l -> l.stream())   //List::stream
                        .distinct()
                        .sorted()
                        .collect(Collectors.toList());
        return studenActivities;
    }

    public static long getStudentActivitiesCount() {
        long noOfStudentActivities =
                StudentDataBase.getAllStudents().stream()   //Stream<Student>
                        .map(Student::getActivities)    // Stream<List<String>>
                        .flatMap(l -> l.stream())   //List::stream
                        .distinct()
                        .count();
        return noOfStudentActivities;
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(getStudentActivitiesCount());
    }
}
