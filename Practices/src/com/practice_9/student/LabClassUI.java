package com.practice_9.student;

public interface LabClassUI {
    void sortStudents();
    Student searchStudent(String name) throws StudentNotFoundException;
    void printStudents();
    void addStudent(double avg, String name) throws EmptyStringException;
}