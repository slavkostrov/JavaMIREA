package com.practice_8;

import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

public class UnfairWaitList <E> extends WaitList<E>{
    private Deque<E> deleted;
    UnfairWaitList(){
        this.list = new ConcurrentLinkedDeque<E>();
        this.deleted = new ConcurrentLinkedDeque<E>();
    }
    public void remove(E element){
        if (this.list.getFirst() == element)
            return;
        if (this.list.contains(element)){
            this.deleted.add(element);
            this.list.remove(element);
        }
    }

    public void add(E element){
        if (this.deleted.contains(element) == false){
            this.list.push(element);
        }
    }

    /**
     * Процедура перемещения объекта в конец списка
     * @param element
     */
    public void moveToBack(E element){
        if (this.list.contains(element)){
            E temp = this.list.poll();
            this.list.addLast(temp);
        }
    }

    public void print_elements(){
        Iterator<E> it = this.list.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }

    @Override
    public String toString(){
        return "UnfairWaitList with " + this.list.size() + " elements.\n";
    }
}
