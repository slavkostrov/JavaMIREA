package com.practice_12.task_2;
import java.util.StringTokenizer;

public class adress_test {
    public static void main(String[] args) {
        // One separator examples
        String temp = "Россия, 76, Ярославль, Тургенева, 22, 1, 25";
        String separator = ",";
        Adress adress = new Adress(temp, separator);
        System.out.println("Input = " + temp);
        System.out.println(adress + "\n");

        temp = "Россия; 76; Ярославль; Тургенева; 22; 1; 25";
        separator = ";";
        adress = new Adress(temp, separator);
        System.out.println("Input = " + temp);
        System.out.println(adress + "\n");

        temp = "Россия/ 76/ Ярославль/ Тургенева/ 22/ 1/ 25";
        separator = "/";
        adress = new Adress(temp, separator);
        System.out.println("Input = " + temp);
        System.out.println(adress + "\n");

        // Different separators examples
        temp = "Россия, 76; Ярославль, Тургенева; 22, 1, 25";
        separator = ",;";
        adress = new Adress(temp, separator, true);
        System.out.println("Input = " + temp);
        System.out.println(adress + "\n");

        temp = "Россия, 76; Ярославль, Тургенева/ 22; 1; 25";
        separator = ";/,";
        adress = new Adress(temp, separator, true);
        System.out.println("Input = " + temp);
        System.out.println(adress + "\n");
    }
}
