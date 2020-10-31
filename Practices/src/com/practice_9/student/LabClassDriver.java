package com.practice_9.student;

import java.util.Locale;
import java.util.Scanner;

public class LabClassDriver {
    public static void main(String[] args) throws EmptyStringException, StudentNotFoundException {
        LabClass test_class = new LabClass();
        System.out.print("1 - add student\n2 - print students\n3 - Search students\n4 - exit");
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);
        int key;
        key = in.nextInt();
        while (key != 4){
            if (key == 1){
                System.out.println("Enter avg and name");
                double avg = in.nextDouble();
                String name = in.next() + " " +  in.next();
                test_class.addStudent(avg, name);
            }
            if (key == 2){
                test_class.printStudents();
            }
            if (key == 3){
                System.out.println("Enter name: ");
                String name = in.next() + " " + in.next();
                try {
                    Student temp = test_class.searchStudent(name);
                    System.out.println(temp);
                }
                catch (Exception t){
                    System.out.println("Not found");
                }
            }
            if (key == 4){
                break;
            }
            key = in.nextInt();
        }

    }
}
