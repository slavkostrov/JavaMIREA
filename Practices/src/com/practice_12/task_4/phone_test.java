package com.practice_12.task_4;

public class phone_test {
    public static void main(String[] args) {
        Phone test_phone = new Phone("+79175655655");
        System.out.println(test_phone);
        test_phone = new Phone("+104289652211");
        System.out.println(test_phone);
        test_phone = new Phone("89175655655");
        System.out.println(test_phone);
    }
}
