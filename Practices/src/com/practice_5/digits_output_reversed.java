package com.practice_5;
import java.util.Scanner;

public class digits_output_reversed{
    public static void F(int x){
        if (x/10 == 0)
        {
            System.out.println(x);
        }
        else
        {
            int y = x%10;
            System.out.println(y);
            F(x/10);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int x = in.nextInt();
        F(x);
    }
}
