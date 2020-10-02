package com.practice_6;

public class list_join {
    public static Student[] merge(Student[] a, Student[] b) {

        Student[] answer = new Student[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length)
            answer[k++] = (a[i].compareTo(b[j]) == 1) ? a[i++] :  b[j++];

        while (i < a.length)
            answer[k++] = a[i++];

        while (j < b.length)
            answer[k++] = b[j++];

        return answer;
    }
    public static void main(String[] args) {
        Student[] list_1 = new Student[10];
        for (int i = 0; i < 10; i++)
            list_1[i] = new Student(9 - i, 9 - i, "unk");
        Student[] list_2 = new Student[10];
        for (int i = 0; i < 10; i++)
            list_2[i] = new Student(9 - i, 9 - i, "unk");
        Student[] answer = merge(list_1, list_2);
        for (Student i: answer){
            System.out.println(i);
        }
    }
}
