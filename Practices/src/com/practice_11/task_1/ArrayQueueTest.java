package com.practice_11.task_1;

public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue test_arr = new ArrayQueue();
        System.out.println("Queue size: " + test_arr.size());
        System.out.println("Is empty? " + test_arr.isEmpty());
        test_arr.push(10);
        test_arr.push(12);
        System.out.println("Queue size: " + test_arr.size());
        System.out.println("Is empty? " + test_arr.isEmpty());
        System.out.println("Pop element: " + test_arr.peek());
        test_arr.clear();
        System.out.println("Queue size after clear: " + test_arr.size());
        System.out.println("Is empty? " + test_arr.isEmpty());
        System.out.println("Pop element: " + test_arr.peek());
    }
}
