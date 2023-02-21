package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StudentsMapExample {

    // map - convert to from one type to another
    public static List<String> namesList(){
        List<String> studentList =
        StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getName) //Stream<String>
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        return studentList;
    }

    public static void main(String[] args) {
        System.out.println(namesList());
    }
}
