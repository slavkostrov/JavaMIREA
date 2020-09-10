package com.practice_5;

public class recursive_reverse {
    public static int reverse_num(int x, int c){
        if (x == 0)
        {
            return c;
        }
        else
        {
            return reverse_num(x/10, x%10 + c*10);
        }
    }
    public static void main(String[] args) {
        System.out.print(reverse_num(12445, 0));
    }
}
