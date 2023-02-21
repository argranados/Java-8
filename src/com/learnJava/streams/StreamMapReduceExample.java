package com.learnJava.streams;

import com.learnJava.data.StudentDataBase;

public class StreamMapReduceExample {

    public static int noOfNotebooks(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel() >= 3)
                .filter(student -> student.getGender().equals("female"))
                .map(s -> s.getNoteBooks())
//                .reduce(0, (a,b) -> a+b);
                .reduce(0, Integer::sum);

    }

    public static void main(String[] args) {
        System.out.println("No of notebooks: "+ noOfNotebooks());
    }
}
