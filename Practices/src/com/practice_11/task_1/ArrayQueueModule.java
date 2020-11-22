package com.practice_11.task_1;

public class ArrayQueueModule {
    private static Object items[];
    private int front, rear;
    private int SIZE;
    public  ArrayQueueModule(int CAPACITY){
        front = -1;
        rear = -1;
        this.SIZE = CAPACITY;
        items = new Object[CAPACITY];
    }

    public boolean isFull(){
        if(front == 0 && rear == SIZE - 1){
            return true;
        }
        if(front == rear + 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(front == -1) return true;
        else return false;
    }

    void enQueue(Object element){
        if(isFull()){
            System.out.println("Queue is full");
        } else {
            if(front == -1) front = 0;
            rear = (rear + 1) % SIZE;
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
    }

    public Object deQueue(){
        Object element;
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        } else {
            element = items[front];
            if(front == rear){
                front = -1;
                rear = -1;
            } /* Q имеет только один элемент, поэтому мы удаляем очередь после удаления. */
            else {
                front=(front+1) % SIZE;
            }
            return element;
        }
    }

    public int getSIZE(){
        return this.SIZE;
    }

    public void clear(){
        front = -1;
        rear = -1;
        this.items = new Object[SIZE];
    }
}