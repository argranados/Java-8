package com.learnJava.defaults;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {

    static Consumer<Student> studentConsumer = (student -> System.out.println(student));
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);

    public static void sortbyName(List<Student> studentList) {
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    public static void sortbyGpa(List<Student> studentList) {
        Comparator<Student> nameComparator = Comparator.comparingDouble(Student::getGpa);
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    public static void comparatorChaining(List<Student> studentList) {
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);
    }

    public static void sortWithNullValues(List<Student> studentList) {
         Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
         studentList.sort(studentComparator);
         studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Before Sort: ");
        studentList.forEach(studentConsumer);
        System.out.println("After Sort: ");
        sortbyName(studentList);
        System.out.println("After Sort: ");
        sortbyGpa(studentList);
        System.out.println("Comparator chaining :");
        comparatorChaining(studentList);
//        System.out.println("Sort with null values");    // to test need insert null in List<Student> students StudentDatabase
//        sortWithNullValues(studentList);
    }
}
