package com.practice_8;

import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class WaitList <E> implements IWaitList <E>{
    /** Поле список */
    protected Deque<E> list;

    /**
     * Конструктор - создание нового объекта
     * @see WaitList#WaitList()
     */
    WaitList(){
        this.list = new ConcurrentLinkedDeque<E>();
    }

    /**
     * Конструктор - создание нового объекта
     * @see WaitList#WaitList(Collection)
     */
    WaitList(Collection <E> c){
        this.list = new ConcurrentLinkedDeque<E>();
        this.list.addAll(c);
    }

    @Override
    public void add(E element) {
       this.list.add(element);
    }

    @Override
    public E remove() {
        return list.remove();
    }

    @Override
    public boolean contains(E element) {
        return this.list.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return this.list.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public String toString(){
        return "WaitList with " + list.size() + " elements.";
    }
}
