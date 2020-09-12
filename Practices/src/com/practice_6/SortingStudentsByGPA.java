package com.practice_6;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator <Student>{


    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAverage() < o2.getAverage())
            return -1;
        else if (o1.getAverage() == o2.getAverage())
            return 0;
        else
            return 1;
    }
}
