package com.itacademy.lesson2;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день");
        int day = scanner.nextInt();

        System.out.println("Введите месяц");
        int month = scanner.nextInt();

        System.out.println("Введите год");
        int year = scanner.nextInt();

        if (isDayValid(day,month,year)) {
            System.out.println(day + " " + month + " " + year);
        } else {
            System.out.println("Дата введена некорректно");
        }
    }

    public static boolean isDayValid (int day, int month, int year) {
        if (0 >= day || 31 < day) {
            return false;
        }
        if (month <= 0 || month > 12) {
            return false;
        }

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 31) {
                    return false;
                }
                break;
            case 2:
                if (Temporal.isTemporal(year)) {
                    if (day > 29) {
                        return false;
                    }
                } else {
                    if (day > 28) {
                        return false;
                    }
                }
                break;
        }
        return true;

    }

}
