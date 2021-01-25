package com.itacademy.lesson2;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядковый номер месяца");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
                default:
                System.out.println("Месяц введен некорректно");
        }
    }

       private void test () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите порядковый номер месяца");
            int inputValue = scanner.nextInt();

            if (inputValue == 1 || inputValue == 2 || inputValue == 12) {
                System.out.println("Зима");
            } else
                //    if (inputValue==3||inputValue==4||inputValue==5) {
                if (3 <= inputValue && 5 >= inputValue) {
                    System.out.println("Весна");
                } else if (6 <= inputValue && 8 >= inputValue) {
                    System.out.println("Лето");
                } else if (9 <= inputValue && 11 >= inputValue) {
                    System.out.println("Осень");
                } else System.out.println("Нет такого месяца");
            //  System.out.println(inputValue);

    }
}
