package com.practice_8;

import java.util.concurrent.ConcurrentLinkedDeque;

public class UnfairWaitList <E> extends WaitList<E>{
    UnfairWaitList(){
        this.list = new ConcurrentLinkedDeque<E>();
    }
    public void remove(E element){
        if (this.list.getFirst() == element)
            return;
        if (this.list.contains(element))
            this.list.remove(element);
    }

    public void moveToBack(E element){
        if (this.list.contains(element)){
            E temp = this.list.poll();
            this.list.addLast(temp);
        }
    }

    @Override
    public String toString(){
        return "UnfairWaitList with " + this.list.size() + " elements.";
    }
}
