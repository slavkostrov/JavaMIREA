package com.practice_12.task_3;


public class shirt_test {
    public static void main(String[] args) {
        String[] input_array  = {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"};

        Shirt[] output_array = new Shirt[input_array.length];
        for (int i = 0; i < input_array.length; i++) {
            output_array[i] = new Shirt(input_array[i]);
        }

        for (int i = 0; i < input_array.length; i++) {
            System.out.println("Shirt " + i);
            System.out.println(output_array[i]);
        }

    }
}
