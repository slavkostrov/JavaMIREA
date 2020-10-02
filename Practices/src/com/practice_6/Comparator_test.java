package com.practice_6;

import java.util.Arrays;
import java.util.TreeSet;

public class Comparator_test
{

    public static void main(String[] args) {
        Student[] list = new Student[20];
        System.out.println("Quick sort: ");
        for (int i = 0; i < 20; i++)
            list[i] = new Student(0, 9 - i, "unk");
        Arrays.sort(list, new SortingStudentsByGPA());
        for (Student i: list){
            System.out.println(i);
        }
        System.out.println("\n");
        System.out.println("Tree set example: ");
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
