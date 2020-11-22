package com.practice_11.task_3;
import com.practice_11.task_3.expressions.TripleExpression;


public class Subtract extends Operation {
    public Subtract(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        return left - right;
    }

    protected double evaluate(double left, double right) {
        return left - right;
    }
}