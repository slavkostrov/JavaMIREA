package com.practice_11.task_1;

public class ArrayQueue {
    private final int start_size = 10;
    private Object array[];
    private int size;
    private int front;
    private int rear;

    public ArrayQueue() {
        array = new Object[start_size];
        size = front = rear = 0;
    }

    // Pre: capacity' > 0
    // Post: if required capacity of array bigger then current
    // Post: capacity' = capacity * 2
    // Inv: if (capacity' = capacity * 2) head < tail
    private void ensureCapacity(int capacity) {
        if (capacity >= array.length) {
            Object[] temp = new Object[array.length << 1];
            int count = rear < front ? array.length - front : size;
            System.arraycopy(array, front, temp, 0, count);
            if (rear < front)
                System.arraycopy(array, 0, temp, count, rear);
            array = temp;
            front = 0;
            rear = size;
        }
    }

    // Pre: value != null
    // Pre: value is immutable
    // Post: queue[size - 1] = element
    // Post: size' = size + 1
    public void enqueue(Object element) {
        assert element != null;
        ensureCapacity(size + 1);
        array[rear] = element;
        rear = (rear + 1) % array.length;
        size++;
    }

    // Pre: size > 0
    // Post: Result = queue[0]
    public Object element() {
        assert size > 0;
        return array[front];
    }

    // Pre: size > 0
    // Post: Result = queue[0]
    // Post: size' = size - 1
    public Object dequeue() {
        assert size > 0;
        Object result = element();
        array[front] = null;
        size--;
        front = (front + 1) % array.length;
        return result;
    }

    // Pre: element != null
    // Pre: element is immutable
    // Post: queue[0] = element
    // Post: size' = size + 1
    public void push(Object element) {
        assert element != null;
        ensureCapacity(size + 1);
        front = (front == 0) ? array.length - 1 : front - 1;
        array[front] = element;
        size++;
    }

    // Pre: size > 0
    // Post: Result = queue[size - 1]
    public Object peek() {
        assert size > 0;
        return array[(rear == 0) ? array.length - 1 : rear - 1];
    }

    // Pre: size > 0
    // Post: Result = queue[size - 1]
    // Post: size' = size - 1
    public Object remove() {
        assert size > 0;
        Object result = peek();
        rear = rear == 0 ? array.length - 1 : --rear;
        array[rear] = null;
        size--;
        return result;
    }

    // Post: Result = size
    public int size() {
        return size;
    }

    // Post: Result = size > 0?
    public boolean isEmpty() {
        return size == 0;
    }

    // INV: size' = 0;
    // Post: Clear the queue
    public void clear() {
        size = front = rear = 0;
        array = new Object[start_size];
    }
}