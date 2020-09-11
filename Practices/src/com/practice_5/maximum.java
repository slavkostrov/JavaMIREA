package com.practice_5;
import java.util.Scanner;

public class maximum {
    private static Scanner in;
    public static void F(int max, int count){
        int x = in.nextInt();
        if (x > 0){
            if (x > max)
                F(x, 1);
            if (x == max)
                F(x, 1 + count);
            else
                F(max, count);
        }
        else {
            System.out.println(count);
        }
    }
    public static void main(String[] args) {
        in = new Scanner(System.in);
        F(0, 0);
    }
}
