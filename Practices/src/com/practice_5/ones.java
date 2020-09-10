package com.practice_5;
import java.util.Scanner;

public class ones {
    private static Scanner in;
    public static int counter(){
        int x = in.nextInt();
        if (x == 0) {
            int y = in.nextInt();
            if (y == 0)
                return 0;
            if (y == 1)
                return 1 + counter();
            else
                return counter();
        }
        else
            if (x == 1)
                return 1 + counter();
        else
            return counter();
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        int answer = counter();
        System.out.println(answer);
    }
}
