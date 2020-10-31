package com.practice_9.student;

import com.practice_9.student.SortingStudentsByGPA;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class LabClass implements LabClassUI{

    private SortingStudentsByGPA comp;
    private TreeSet<Student> students_list;

    LabClass(){
        this.comp = new SortingStudentsByGPA();
        this.students_list  = new TreeSet<Student>(this.comp);
    }

    public boolean isEmpty(){
        return students_list.isEmpty();
    }

    public int getSize(){
        return students_list.size();
    }

    @Override
    public void sortStudents() {
        return;
    }
    @Override
    public Student searchStudent(String name) throws StudentNotFoundException {
        for (Student x : students_list) {
            if (x.getName().equals(name)) {
                return x;
            }
        }
        throw new StudentNotFoundException(name + "not found");
    }
    @Override
    public void printStudents() {
        if (students_list.isEmpty())
            return;
        for (Student x: students_list)
            System.out.println(x);
    }
    @Override
    public void addStudent(double avg, String name) throws EmptyStringException {
        Student student = new Student(avg, name);
        students_list.add(student);
    }
}
