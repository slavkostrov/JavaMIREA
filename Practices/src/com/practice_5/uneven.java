package com.practice_5;
import java.util.Scanner;

public class uneven{
    private static Scanner in;
    public static void uneven_counter(){
        int x = in.nextInt();
        if (x == 0)
            return;
        else
        if (x%2 == 1) {
            System.out.print(x + " ");
            uneven_counter();
        }
        else
            uneven_counter();
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        uneven_counter();
    }
}
