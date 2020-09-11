package com.practice_5;
import java.util.Scanner;
public class maximum_2 {
    public static int maximum(){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x == 0)
            return 0;
        int y = maximum();
        if (x > y)
            return x;
        else
            return y;
    }
    public static void main(String[] args) {
        System.out.println(maximum());
    }
}
