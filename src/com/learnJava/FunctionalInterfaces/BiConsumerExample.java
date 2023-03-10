package com.learnJava.FunctionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : "+activities);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));
    }

    public static void main(String[] args) {
        nameAndActivities();

        BiConsumer<String,String> biConsumer = (a,b) -> {
            System.out.println("a: "+a+ " b: "+b);
        };
        biConsumer.accept("Java7","Java8");

        BiConsumer<Integer,Integer> multiply = (a,b) -> {
            System.out.println("Multiplication is: "+ (a*b));
        };

        BiConsumer<Integer,Integer> division = (a,b) -> {
            System.out.println("division is: "+ (a/b));
        };

        multiply.andThen(division).accept(10,5);
    }
}
