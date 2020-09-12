package com.practice_6;

import java.util.TreeSet;

public class Comparator_test
{

    public static void main(String[] args) {
        SortingStudentsByGPA comp = new SortingStudentsByGPA();
        TreeSet<Student> students = new TreeSet<Student>(comp);
        students.add(new Student(1, 10, "Mawa"));
        students.add(new Student(3, 11.66, "Ma2"));
        students.add(new Student(19, 12.1, "Ma3"));
        students.add(new Student(2, 4.5, "Ma4"));
        students.add(new Student(10, 1, "Ma5"));
        for (Student i: students){
            System.out.println(i);
        }
    }
}
