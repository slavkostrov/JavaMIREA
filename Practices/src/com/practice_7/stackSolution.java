package com.practice_7;

import java.util.Stack;

public class stackSolution {
    public static void game(int player_1, int player_2){
        Stack<Integer> st1  = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();
        Stack<Integer> temp = new Stack<Integer>();
        for (int i = 0; i < 5; ++i){
            st1.push(player_1 % 10);
            st2.push(player_2 % 10);
            player_1 /= 10;
            player_2 /= 10;
        }

        for (int i = 1; i <= 106; i++){
            if (st1.empty()){
                System.out.println("Player_2 win, " + (i-1));
                return;
            }
            if (st2.empty()){
                System.out.println("Player_1 win "+ (i-1));
                return;
            }

            int t1 = st1.pop();
            int t2 = st2.pop();

            if (t1 > t2){
                while (!st1.empty())temp.push(st1.pop());
                st1.push(t2);
                st1.push(t1);
                while (!temp.empty())st1.push(temp.pop());
            }
            else {
                while (!st2.empty())temp.push(st2.pop());
                st2.push(t1);
                st2.push(t2);
                while (!temp.empty())st2.push(temp.pop());
            }
        }
    }

    public static void main(String[] args) {
        game(13579, 24680);
    }
}
