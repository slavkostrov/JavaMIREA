package com.practice_7;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class dequeSolution {
    public static void game(String player_1, String player_2){
        Deque<Integer> st1  =  new LinkedList<>();
        Deque<Integer> st2  =  new LinkedList<>();
        for (int i = 0; i < 5; ++i){
            st1.add( Character.getNumericValue(player_1.charAt(i)));
            st2.add(Character.getNumericValue(player_2.charAt(i)));
        }

        for (int i = 1; i <= 106; i++){
            if (st1.isEmpty()){
                System.out.println("Player_2 win, " + (i-1));
                return;
            }
            if (st2.isEmpty()){
                System.out.println("Player_1 win "+ (i-1));
                return;
            }

            int t1 = st1.poll();
            int t2 = st2.poll();

            if (t1 > t2){
                st1.add(t1);
                st1.add(t2);
            }
            else {
                st2.add(t2);
                st2.add(t1);
            }
        }
        System.out.println("Botva");
    }

    public static void main(String[] args) {
        game("13579", "24680");
    }
}
