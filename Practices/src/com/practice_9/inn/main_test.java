package com.practice_9.inn;

import com.practice_9.inn.BadCodeException;

import java.util.Scanner;

// ИНН физического лица является последовательностью из 12 цифр

public class main_test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String name = in.nextLine();
        int code = 0;
        boolean flag = false;
        for (int i = 0; i < 10; ++i) {
            System.out.print("Введите ИНН: ");
            String s = in.nextLine();
            try {
                code = Integer.parseInt(s);
                checkCode(code);
                flag = true;
                break;
            }
            catch (Throwable p){
                System.out.println("Был введён неверный ИНН");
            }
        }

        if (flag)
            System.out.println("ФИО: " + name + " ИНН: " + code);
        else
            System.out.println("Совершено 10 неверных попыток. Выход...");
    }

    private static void checkCode(int code) throws BadCodeException {
        if ((Integer.toString(code)).length() != 9)
            throw new BadCodeException("Плохой ИНН");
    }
}
