package com.practice_11.task_2;

public interface Queue <E> {

    public boolean isEmpty();
    public int getSize();
    public void push(E element);
    public E pop();
    public E peek();

}


