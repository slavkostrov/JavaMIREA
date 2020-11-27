package com.practice_12.task_4;

public class Phone {
    private String number;
    Phone(String number)
    {
        this.number = number;
    }

    @Override
    public String toString() {
        // last_4 = String substring(number.length - 4, number.length)
        // last_3_2 = = String substring(number.length - 8, number.length - 5)
        // last_3_1 = = String substring(number.length - 11, number.length - 8)
        return  this.number.substring(0, this.number.length() - 10) + "-"
                +this.number.substring(this.number.length() - 10, this.number.length() - 7) + "-"
                +this.number.substring(this.number.length() - 7, this.number.length() - 4) + "-"
                +this.number.substring(this.number.length() - 4);
    }
}
