package com.practice_6;


import java.util.ArrayList;
import java.util.List;

public class test_sort {
    public static void insertion_sort(Comparable[] list){
        for (int i = 1; i < list.length; i++)
        {
            Comparable key = list[i];
            int j = i;
            while (j >= 1 && list[j-1].compareTo(key) > 0)
            {
                list[j] = list[j-1];
                j = j - 1;
            }
            list[j] = key;
        }
    }

    public static void main(String[] args) {
        Student[] list= new Student[20];
        for (int i = 0; i < 10; i++)
            list[i] = new Student(9 - i);
        for (int i = 10; i < 20; i++)
            list[i] = new Student(i);
        insertion_sort(list);
        for (int i = 0; i < 20; i++)
            System.out.println(list[i].toString());
    }
}

