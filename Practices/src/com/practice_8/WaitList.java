package com.practice_8;

import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class WaitList <E> implements IWaitList <E>{
    protected Deque<E> list;

    WaitList(){
        this.list = new ConcurrentLinkedDeque<E>();
    }

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
        for (int i = 0; i < c.size(); i++){
            if (this.list.contains(c.toArray()[i]) == false){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }
}
