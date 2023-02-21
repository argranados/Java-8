package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {

    public static List<Student> sortStudentsbyName(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsbyGpa(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsbyGpaDescending(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Students sorted by Name: ");
        sortStudentsbyName().forEach(System.out::println);
        System.out.println("Students sorted by Gpa: ");
        sortStudentsbyGpa().forEach(System.out::println);
        System.out.println("Students sorted by Gpa reversed : ");
        sortStudentsbyGpaDescending().forEach(System.out::println);
    }
}
