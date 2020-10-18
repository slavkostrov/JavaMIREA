package com.practice_8;

import java.util.concurrent.ConcurrentLinkedDeque;

public class BoundedWaitList <E> extends WaitList<E>{
    /** Поле ёмкость */
    private int capacity;

    /**
     * Конструктор - создание нового объекта
     * @see BoundedWaitList#BoundedWaitList(int)
     */
    BoundedWaitList(int capacity) {
        this.list = new ConcurrentLinkedDeque<E>();
        this.capacity = capacity;
    }
    /**
     * Функция получения значения ёмкости
     * @return int - capacity
     */
    public int getCapacity(){
        return this.capacity;
    }
    public void add(E element){
        if (this.list.size() < this.capacity){
            this.list.push(element);
        }
    }

    @Override
    public String toString(){
        return "BoundedWaitList with " + capacity + " elements.";
    }
}
