package com.itacademy.lesson2;

import java.util.Scanner;

public class DayMonthYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день");
        int day = scanner.nextInt();

        System.out.println("Введите месяц");
        int month = scanner.nextInt();

        System.out.println("Введите год");
        int year = scanner.nextInt();

        nextDay(day, month, year);
        System.out.println();

    }
    private static void nextDay(int day, int month, int year) {

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                if (day>=1 && day <=29) {
                    day++;
                } else {
                    day=1;
                }
                break;
            case 2:
                if (Temporal.isTemporal(year)) {
                    if (day>=1 && day <=28) {
                        day++;
                    } else {
                        day=1;
                    }
                } else {
                    if (day>=1 && day <=27) {
                        day++;
                    } else {
                        day=1;
                    }
                }
                break;
            default:
                if (day>=1 && day <=30) {
                    day++;
                } else {
                    day=1;
                }
        }
            if (month>=1 && month <=11 && day ==1) {
                month++;
            } else if (month==12 && day ==1){
                month=1;
            }

        if (month==1 && day==1) {
            year++;
        }

        System.out.printf("Следующий день: %d.%d.%d \n",day,month,year);
    }
}
