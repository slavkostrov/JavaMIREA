package com.practice_5;
import java.util.Scanner;

public class ones {
    private static Scanner in;
    public static int counter(int prev){
        int x = in.nextInt();
        if (x == prev && x == 0)
            return 0;
        else
            if (x==1)
                return 1 + counter(x);
        else
            return counter(x);
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        int answer = counter(1);
        System.out.println(answer);
    }
}
