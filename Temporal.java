package com.itacademy.lesson2;

import java.util.Scanner;

public class Temporal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();

        if (isTemporal(year)) {
            System.out.println(year + " вискокосный");
        } else {
            System.out.println(year + " не високосный");
        }
    }

    public static boolean isTemporal(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}