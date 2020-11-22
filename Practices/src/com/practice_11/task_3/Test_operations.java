package com.practice_11.task_3;

import com.practice_11.task_3.objects.Const;
import com.practice_11.task_3.objects.Variable;

public class Test_operations {
    public static void main(String[] args) {
        System.out.println(new Subtract(new Multiply(new Const(2), new Variable("x")),new Const(3)).evaluate(5, 0));
    }
}
