package com.practice_11.task_1;

public class ArrayQueueADT {
    private static final int start_size = 10;
    private Object items[];
    private int size;
    private int front;
    private int rear;

    public ArrayQueueADT() {
        items = new Object[start_size];
        size = front = rear = 0;
    }

    private static void ensureCapacity(ArrayQueueADT adt, int capacity) {
        if (capacity >= adt.items.length) {
            Object[] temp = new Object[adt.items.length << 1];
            int count = adt.rear < adt.front ? adt.items.length - adt.front : adt.size;
            System.arraycopy(adt.items, adt.front, temp, 0, count);
            if (adt.rear < adt.front)
                System.arraycopy(adt.items, 0, temp, count, adt.rear);
            adt.items = temp;
            adt.front = 0;
            adt.rear = adt.size;
        }
    }

    public static void enqueue(ArrayQueueADT adt, Object element) {
        assert element != null;
        ensureCapacity(adt, adt.size + 1);
        adt.items[adt.rear] = element;
        adt.rear = (adt.rear + 1) % adt.items.length;
        adt.size++;
    }

    public static Object element(ArrayQueueADT adt) {
        assert adt.size > 0;
        return adt.items[adt.front];
    }

    public static Object dequeue(ArrayQueueADT adt) {
        assert adt.size > 0;
        Object result = element(adt);
        adt.items[adt.front] = null;
        adt.size--;
        adt.front = (adt.front + 1) % adt.items.length;
        return result;
    }

    public static void push(ArrayQueueADT adt, Object element) {
        assert element != null;
        ensureCapacity(adt, adt.size + 1);
        adt.front = (adt.front == 0) ? adt.items.length - 1 : adt.front - 1;
        adt.items[adt.front] = element;
        adt.size++;
    }

    public static Object peek(ArrayQueueADT adt) {
        assert adt.size > 0;
        return adt.items[(adt.rear == 0) ? adt.items.length - 1 : adt.rear - 1];
    }

    public static Object remove(ArrayQueueADT adt) {
        assert adt.size > 0;
        Object result = peek(adt);
        adt.rear = adt.rear == 0 ? adt.items.length - 1 : --adt.rear;
        adt.items[adt.rear] = null;
        adt.size--;
        return result;
    }

    public static int size(ArrayQueueADT adt) {
        return adt.size;
    }

    public static boolean isEmpty(ArrayQueueADT adt) {
        return adt.size == 0;
    }

    public static void clear(ArrayQueueADT adt) {
        adt.size = adt.front = adt.rear = 0;
        adt.items = new Object[start_size];
    }

}