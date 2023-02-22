package com.learnJava.optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    //orElse
    public static String OptionalOrElse() {
        /*Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());*/
        Optional<Student> studentOptional = Optional.ofNullable(null);

        String name = studentOptional.map(Student::getName).orElse("Default");
        return name;
    }
    //orElseGet
    public static String OptionalOrElseGet() {
/*        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());*/
        Optional<Student> studentOptional = Optional.ofNullable(null);

        String name = studentOptional.map(Student::getName).orElseGet(()->"Default");
        return name;
    }
    //OrElseThrow
    public static String OptionalOrElseThrow() {
/*        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());*/
        Optional<Student> studentOptional = Optional.ofNullable(null);

        String name = studentOptional.map(Student::getName).orElseThrow(()->new RuntimeException("No Data Available"));
        return name;
    }

    public static void main(String[] args) {
        System.out.println(OptionalOrElse());
        System.out.println(OptionalOrElseGet());
        System.out.println(OptionalOrElseThrow());
    }
}
