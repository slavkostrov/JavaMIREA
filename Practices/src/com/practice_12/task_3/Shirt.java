package com.practice_12.task_3;

public class Shirt {
    private String code;
    private String name;
    private String color;
    private String size;

    Shirt(String input){
        String[] split = input.split(",");
        assert split.length == 4;
        this.code = split[0];
        this.name = split[1];
        this.color = split[2];
        this.size = split[3];
    }

    @Override
    public String toString() {
        return "Code: " + this.code
                +"\nType: " + this.name
                +"\nColor: " + this.color
                +"\nSize: " + this.size + "\n";
    }
}

