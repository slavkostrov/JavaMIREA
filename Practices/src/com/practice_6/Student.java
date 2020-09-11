package com.practice_6;

public class Student {
    private int age;
    private double average;
    private String name;
    public Student(int age, double average, String name){
        this.age = age;
        this.average = average;
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public double getAverage() {
        return average;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return "Name: " + this.name + " Age: " + this.age + " with avg = " + this.average;
    }
}
