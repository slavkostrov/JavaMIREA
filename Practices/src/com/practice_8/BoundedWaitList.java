package com.practice_8;

public class BoundedWaitList <E> extends WaitList<E>{
    private int capacity;
    BoundedWaitList(int size){
        this.capacity = size;
    }
    public int getCapacity(){
        return this.capacity;
    }
    public void add(E element){
        if (this.list.size() < this.capacity)
            this.list.push(element);
        this.capacity+=1;
    }

    @Override
    public String toString(){
        return "BoundedWaitList";
    }
}
