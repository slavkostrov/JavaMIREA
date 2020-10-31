package com.practice_10.chairFactory;

public class VictorianChair implements Chair{
    private int age;

    VictorianChair(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public int getPrice() {
        return 333;
    }
}
