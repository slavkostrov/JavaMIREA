package com.practice_10.chairFactory;

public class FunctionalChair implements Chair {
    private int last_a;
    private int last_b;

    FunctionalChair(){
        last_a = 0;
        last_b = 0;
    }

    @Override
    public int getPrice() {
        return 666;
    }

    int sum(int a, int b){
        this.last_a = a;
        this.last_b = b;
        return a + b;
    }

}
