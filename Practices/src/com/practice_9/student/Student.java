package com.practice_9.student;

public class Student implements Comparable <Student>{
    private int age;
    private double average; // GPA
    private String name;
    public Student(double average, String name) throws EmptyStringException {
        if(name.isEmpty())
            throw new EmptyStringException("Name cannot be an empty string");
        this.average = average;
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
        this.average = 0;
        this.name = "Unknown";
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

    @Override
    public int compareTo(Student o) {
        if (this.age > o.age)
            return 1;
        else
            if (this.age == o.age)
                return 0;
        else
            return -1;
    }
}
