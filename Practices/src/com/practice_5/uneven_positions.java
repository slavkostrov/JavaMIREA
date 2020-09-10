package com.practice_5;
import java.util.Scanner;

public class uneven_positions{
    private static Scanner in;
    public static void uneven_counter(){
        int x = in.nextInt();
        if (x == 0)
            return;
        else {
            System.out.println(x);
            in.next();
            uneven_counter();
        }
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        uneven_counter();
    }
}
