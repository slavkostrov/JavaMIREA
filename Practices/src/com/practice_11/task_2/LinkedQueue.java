package com.practice_11.task_2;

public class LinkedQueue <E> implements Queue <E>{
    private List<E> items;
    private int size;

    public LinkedQueue(){
        this.size = 0;
        this.items = new List<E>();
    }


    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void push(E element) {
        this.items.addBack(element);
    }

    @Override
    public E pop() {
        E item = this.items.pop();
        this.items.delEl(item);
        return item;
    }

    @Override
    public E peek() {
        E item = this.items.pop();
        return item;
    }
}
